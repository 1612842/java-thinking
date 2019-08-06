package com.cong.http.security.services;


import com.cong.http.model.Game;
import com.cong.http.model.User;
import com.cong.http.repository.GameRepository;
import com.cong.http.repository.RoundRepository;
import com.cong.http.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GameService.class)
public class GameServiceTest {

    @MockBean
    GameRepository gameRepository;

    @MockBean
    RoundRepository roundRepository;

    @MockBean
    UserRepository userRepository;

    @Autowired
    private GameService gameService;

    @Before
    public void setUp() {

    }

    @Test
    public void getResultTest() {
        int userChoice = 1;
        int machineChoice = 2;
        Assert.assertEquals(gameService.getResult(userChoice,machineChoice),"L");
    }

    @Test
    public void getRandomTest() {
        assertTrue(1 <= gameService.getRandomChoice() && gameService.getRandomChoice() <= 3);
    }
}
