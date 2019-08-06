package com.cong.http.security.services;


import com.cong.http.message.response.WinRateResponse;
import com.cong.http.message.response.WinRateResponses;
import com.cong.http.model.Game;
import com.cong.http.model.Round;
import com.cong.http.model.User;
import com.cong.http.repository.GameRepository;
import com.cong.http.repository.RoundRepository;
import com.cong.http.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameService {
    private static final Logger logger = LoggerFactory.getLogger(GameService.class);


    @Autowired
    GameRepository gameRepository;

    @Autowired
    RoundRepository roundRepository;

    @Autowired
    UserRepository userRepository;

    GameService(){

    }
    public int getRandomChoice(){

        int random = (int) (Math.random() * 3 + 1);

        logger.info("getRandomChoice() -> "+random);
        return random;
    }

    public String getResult(int userChoice, int machineChoice){
        logger.info("getResult(userChoice, machineChoice) "+userChoice+" "+machineChoice);

        if (userChoice == machineChoice) {
            return "D";
        } else if (userChoice == machineChoice - 1 || userChoice == machineChoice + 2) {
            return "L";
        } else {
            return "W";
        }
    }

    public Round addRoundToGame(User user, Round round){
        logger.info("Round addRoundToGame(User user, Round round)");

        logger.info("User id: "+user.getId());
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

        if (round.getResult()=="W"){
            user.setWinRounds(user.getWinRounds() + 1);
        }
        user.setTotalRounds(user.getTotalRounds() + 1);

        if (round.getResult() == "W" || round.getResult() == "L") {
            curGame.setTimeEnd(new Date());
            curGame.setResult(round.getResult());
        }

        logger.info("CurrentGame: "+curGame.getId()+ " "+curGame.getResult()+" "+curGame.getUser().getUsername());

        logger.info("Round: "+round.getResult()+" userChoice:"+round.getChoice()+" machineChoice:"+round.getMachine());

        gameRepository.save(curGame);
        round.setGame(curGame);
        roundRepository.save(round);
        userRepository.save(user);

        return round;
    }

    public List<Game> getHistory(User user){
        logger.info("getHistory(User user) "+user.getId()+" "+user.getUsername());

        return gameRepository.findByUserIdOrderByIdDesc(user.getId());
    }

    public List<WinRateResponse> getRanking(){
        logger.info("List<WinRateResponse> getRanking()");

        List<User> users = userRepository.findTop100WinRate();
        return (new WinRateResponses(users)).getWinRateResponses();
    }
}
