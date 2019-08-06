package com.cong.grpc;

import com.cong.api.grpc.*;
import com.cong.http.message.response.WinRateResponse;
import com.cong.http.model.Game;
import com.cong.http.model.Round;
import com.cong.http.model.User;
import com.cong.http.repository.GameRepository;
import com.cong.http.repository.UserRepository;
import com.cong.http.security.jwt.JwtProvider;
import com.cong.http.security.services.GameService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GRpcService
public class gRPCServiceImpl extends gRPCServiceGrpc.gRPCServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(gRPCServiceImpl.class);


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    GameRepository gameRepository;


    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    GameService gameService;

    @Override
    public void authenticateUser(SigninRequest request, StreamObserver<SigninResponse> responseObserver) {
        logger.info("void authenticateUser "+request.getUsername()+" "+request.getPassword());

        SigninResponse signinResponse;
        Optional<User> userOp = userRepository.findByUsername(request.getUsername());
        User user = null;
        if (userOp.isPresent())
            user = userOp.get();
        if (!userOp.isPresent()) {
            signinResponse = SigninResponse.newBuilder().setStatus("FAIL").setMessage("Username wrong").build();
        } else if (!encoder.matches(request.getPassword(), user.getPassword())) {
            signinResponse = SigninResponse.newBuilder().setStatus("FAIL").setMessage("Password wrong").build();
        } else {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);

            String jwt = jwtProvider.generateJwtToken(authentication);

            TokenMessage tokenMessage = TokenMessage.newBuilder().setType("Bearer").setToken(jwt).build();

            signinResponse = SigninResponse.newBuilder().setStatus("SUCCESS").setMessage("Authentication token").setData(tokenMessage).build();
        }

        responseObserver.onNext(signinResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void registerUser(SignupRequest request, StreamObserver<SignupResponse> responseObserver) {
        logger.info("void registerUser() "+ request.getUsername()+" "+request.getPassword()+" "+request.getEmail()+" "+request.getName());

        SignupResponse signupResponse;
        if (userRepository.existsByUsername(request.getUsername())) {
            signupResponse = SignupResponse.newBuilder().setStatus("FAIL").setMessage("Fail -> Username is already taken!").build();
        } else {
            User user = new User(request.getName(), request.getUsername(), request.getEmail(), encoder.encode(request.getPassword()));

            userRepository.save(user);

            signupResponse = SignupResponse.newBuilder().setStatus("SUCCESS").setMessage("User registered successfully!").build();
        }

        responseObserver.onNext(signupResponse);
        responseObserver.onCompleted();
    }

    public RoundRPC getRoundFromModel(Round round) {
        logger.info("RoundRPC getRoundFromModel(Round round) "+round.getId()+" userChoice:"+round.getChoice()+" machineChoice:"+round.getMachine()+" "+round.getResult());

        return RoundRPC.newBuilder().setMachineChoice(Integer.valueOf(round.getMachine())).setUserChoice(Integer.valueOf(round.getChoice())).setResult(round.getResult()).build();
    }

    @Override
    public void playGame(ChoiceRequest request, StreamObserver<ChoiceResponse> responseObserver) {
        logger.info("void playGame(ChoiceRequest request) "+ request.getToken()+" "+request.getChoice());
        try {
            ChoiceResponse choiceResponse;

            String jwtToken = request.getToken();

            if(request.getChoice()<1||request.getChoice()>3){
                choiceResponse = ChoiceResponse.newBuilder().setStatus("FAIL").setMessage("Choice invalid!").build();
            }
            else if (jwtToken != null && jwtProvider.validateJwtToken(jwtToken)) {
                String username = jwtProvider.getUserNameFromJwtToken(jwtToken);
                User user = userRepository.findByUsername(username).get();

                if (user != null) {
                    int machineChoice = gameService.getRandomChoice();
                    int userChoice = request.getChoice();
                    String userResult = gameService.getResult(userChoice, machineChoice);

                    Round round = new Round(new Date(), String.valueOf(userChoice), String.valueOf(machineChoice), userResult);

                    gameService.addRoundToGame(user, round);

                    RoundRPC myRound = getRoundFromModel(round);
                    choiceResponse = ChoiceResponse.newBuilder().setStatus("SUCCESS").setMessage("Choice result").setData(myRound).build();
                } else {
                    choiceResponse = ChoiceResponse.newBuilder().setStatus("FAIL").setMessage("Username not found").build();
                }
            } else {
                choiceResponse = ChoiceResponse.newBuilder().setStatus("FAIL").setMessage("Token wrong").build();
            }

            responseObserver.onNext(choiceResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.error("gRPCServiceImpl: " + e);
        }
    }

    public List<GameRPC> getAndConvertToListGameRPC(List<Game> games) {
        logger.info("List<GameRPC> getAndConvertToListGameRPC(List<Game> games) size:"+games.size());

        if (games.size() == 0) return new ArrayList<GameRPC>();
        return games.stream()
                .map(a -> GameRPC.newBuilder()
                        .setId(a.getId())
                        .setCreatedAt(a.getTimeStart().toString())
                        .addAllRounds(a.getRounds().stream()
                                .map(b -> RoundRPC.newBuilder()
                                        .setMachineChoice(Integer.parseInt(b.getMachine()))
                                        .setUserChoice(Integer.parseInt(b.getChoice()))
                                        .setResult(b.getResult())
                                        .build())
                                .collect(Collectors.toList()))
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public void getHistory(MyMessage request, StreamObserver<HistoryResponse> responseObserver) {
        logger.info("void getHistory(MyMessage request, ..) "+request.getToken());

        HistoryResponse historyResponse;

        String jwtToken = request.getToken();
        if (jwtToken != null && jwtProvider.validateJwtToken(jwtToken)) {
            String username = jwtProvider.getUserNameFromJwtToken(jwtToken);
            User user = userRepository.findByUsername(username).get();

            if (user != null) {
                historyResponse = HistoryResponse.newBuilder().setStatus("SUCCESS").setMessage("History of " + username).addAllData(getAndConvertToListGameRPC(gameService.getHistory(user))).build();
            } else {
                historyResponse = HistoryResponse.newBuilder().setStatus("FAIL").setMessage("Username not found").build();
            }
        } else {
            historyResponse = HistoryResponse.newBuilder().setStatus("FAIL").setMessage("Token wrong").build();
        }

        responseObserver.onNext(historyResponse);
        responseObserver.onCompleted();
    }

    public List<InfoTopUser> getAndConvertToInfoTopUser(List<WinRateResponse> rankingResponses) {
        logger.info("List<InfoTopUser> getAndConvertToInfoTopUser(List<WinRateResponse> rankingResponses)");

        if (rankingResponses.size() == 0) return new ArrayList<InfoTopUser>();
        return rankingResponses.stream().map(a -> InfoTopUser.newBuilder().setUsername(a.getUsername()).setWinRate(a.getWinRate()).build()).collect(Collectors.toList());
    }

    @Override
    public void getRanking(MyMessage request, StreamObserver<RankingResponse> responseObserver) {
        logger.info("void getRanking(MyMessage request,..) "+request.getToken());

        RankingResponse rankingResponse;

        String jwtToken = request.getToken();
        if (jwtToken != null && jwtProvider.validateJwtToken(jwtToken)) {
            rankingResponse = RankingResponse.newBuilder().setStatus("SUCCESS").setMessage("Ranking").addAllData(getAndConvertToInfoTopUser(gameService.getRanking())).build();
        } else {
            rankingResponse = RankingResponse.newBuilder().setStatus("FAIL").setMessage("Token wrong").build();
        }

        responseObserver.onNext(rankingResponse);
        responseObserver.onCompleted();
    }
}