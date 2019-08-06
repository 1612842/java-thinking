package com.cong.grpc;

import com.cong.api.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class gRPCClientForTest {
    private gRPCServiceGrpc.gRPCServiceBlockingStub gRPCServiceBlockingStub;

    @PostConstruct
    private void initialize(){
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build();

        gRPCServiceBlockingStub = gRPCServiceGrpc.newBlockingStub(managedChannel);
    }

    public SigninResponse authenticateUser(String username, String password){
        SigninRequest userRequest= SigninRequest.newBuilder().setUsername(username).setPassword(password).build();
        SigninResponse loginResponse = gRPCServiceBlockingStub.authenticateUser(userRequest);
        return loginResponse;
    }

    public SignupResponse registerUser(String name, String username, String password, String email){
        SignupRequest userRequest = SignupRequest.newBuilder().setName(name).setEmail(email).setUsername(username).setPassword(password).build();
        SignupResponse signupResponse = gRPCServiceBlockingStub.registerUser(userRequest);
        return signupResponse;
    }

    public ChoiceResponse playGame(String token, int choice){
        ChoiceRequest choiceRequest = ChoiceRequest.newBuilder().setToken(token).setChoice(choice).build();
        ChoiceResponse choiceResponse = gRPCServiceBlockingStub.playGame(choiceRequest);
        return choiceResponse;
    }

    public HistoryResponse getHistory(String token){
        MyMessage myMessage = MyMessage.newBuilder().setToken(token).build();
        HistoryResponse historyResponse = gRPCServiceBlockingStub.getHistory(myMessage);
        return historyResponse;
    }

    public RankingResponse getRanking(String token){
        MyMessage myMessage = MyMessage.newBuilder().setToken(token).build();
        RankingResponse rankingResponse = gRPCServiceBlockingStub.getRanking(myMessage);
        return rankingResponse;
    }
}