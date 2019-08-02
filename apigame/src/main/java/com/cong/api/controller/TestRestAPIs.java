package com.cong.api.controller;

import com.cong.api.message.response.GameResponse;
import com.cong.api.message.response.WinRateResponse;
import com.cong.api.message.response.WinRateResponses;
import com.cong.api.model.Game;
import com.cong.api.model.Round;
import com.cong.api.model.User;
import com.cong.api.repository.GameRepository;
import com.cong.api.repository.RoundRepository;
import com.cong.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class TestRestAPIs {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private RoundRepository roundRepository;

    @GetMapping("/test/user")
    public String userAccess() {
        return ">>> User Contents!";
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}/history")
    public List<Game> getHistory(@PathVariable Long userId) {
        return gameRepository.findByUserId(userId);
    }

    @GetMapping("/users/top100Win")
    public ResponseEntity<?> getTop100WinRate() {
        List<User> users = userRepository.findTop100WinRate();

        return ResponseEntity.ok(new WinRateResponses(users));
    }

    @GetMapping("/games")
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @PostMapping("/users/{userId}/play/{choiceId}")
    public ResponseEntity<?> playGame(@PathVariable Long userId,
                                      @PathVariable Long choiceId) {

        Optional<User> userOp = userRepository.findById(userId);
        User user = userOp.get();

        List<Game> gameUndone = gameRepository.findByUserIdAndResult(user.getId(), "-");
        Game curGame;
        if (gameUndone.size() == 0) {
            //game
            Game game = new Game();
            game.setTimeStart(new Date());
            game.setResult("-");
            game.setUser(user);
            curGame = gameRepository.save(game);
        } else {
            curGame = gameUndone.get(0);
        }
        //round
        Round round = new Round();
        round.setChoice(String.valueOf(choiceId));
        round.setTime(new Date());
        int random = (int) (Math.random() * 3 + 1);
        round.setMachine(String.valueOf(random));

        if (choiceId == random) {
            round.setResult("D");
        } else if (choiceId == random - 1 || choiceId == random + 2) {
            round.setResult("L");
        } else {
            round.setResult("W");
            user.setWinRounds(user.getWinRounds() + 1);
        }
        user.setTotalRounds(user.getTotalRounds() + 1);

        if (round.getResult() == "W" || round.getResult() == "L") {
            curGame.setTimeEnd(new Date());
            curGame.setResult(round.getResult());
        }

        round.setGame(curGame);
        roundRepository.save(round);
        userRepository.save(user);

        return ResponseEntity.ok(new GameResponse(curGame, roundRepository.findByGameId(curGame.getId())));
    }
}