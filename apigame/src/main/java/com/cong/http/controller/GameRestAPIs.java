package com.cong.http.controller;

import com.cong.http.message.response.GameResponse;
import com.cong.http.message.response.HistoryResponse;
import com.cong.http.message.response.WinRateResponses;
import com.cong.http.model.Game;
import com.cong.http.model.Round;
import com.cong.http.model.User;
import com.cong.http.repository.GameRepository;
import com.cong.http.repository.RoundRepository;
import com.cong.http.repository.UserRepository;
import com.cong.http.security.services.GameService;
import com.cong.http.security.services.UserPrinciple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GameRestAPIs {

    private static final Logger logger = LoggerFactory.getLogger(GameRestAPIs.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private RoundRepository roundRepository;

    @Autowired
    private GameService gameService;


    @GetMapping("/users/{userId}/history")
    public ResponseEntity<?> getHistory(@PathVariable Long userId) {
        logger.info("GET /users/"+userId+"/history");

        List<Game> history = gameRepository.findByUserIdOrderByIdDesc(userId);
        if (history.isEmpty())
            return new ResponseEntity<String>("FAIL -> No history found!",
                    HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok(new HistoryResponse("SUCCESS","History of user "+userId,history));

    }

    @GetMapping("/users/top100Win")
    public ResponseEntity<?> getTop100WinRate() {
        logger.info("GET /users/top100Win");

        List<User> users = userRepository.findTop100WinRate();

        return ResponseEntity.ok(new WinRateResponses("SUCCESS","Top Ranking 100 Users",users));
    }


    @PostMapping("/users/play/{choiceId}")
    public ResponseEntity<?> playGame(Authentication authentication,
                                      @PathVariable Long choiceId) {

        logger.info("POST /users/play/"+choiceId+" username:"+authentication.getName()+" choice:"+choiceId);

        if (choiceId<1||choiceId>3){
            return new ResponseEntity<String>("FAIL -> Choice invalid!", HttpStatus.BAD_REQUEST);
        }

        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        User user = new User(userPrinciple.getId(),userPrinciple.getName(),userPrinciple.getUsername(),userPrinciple.getEmail(),userPrinciple.getPassword());
        logger.info("User: "+user.getId()+" "+user.getUsername()+" "+user.getName()+" "+user.getEmail()+" "+user.getPassword());

        int machineChoice = gameService.getRandomChoice();

        String userResult = gameService.getResult(Math.toIntExact(choiceId), machineChoice);

        Round round = new Round(new Date(), String.valueOf(choiceId),String.valueOf(machineChoice), userResult);

        round = gameService.addRoundToGame(user, round);
        return ResponseEntity.ok(new GameResponse("SUCCESS","Choice response",round));
    }
}