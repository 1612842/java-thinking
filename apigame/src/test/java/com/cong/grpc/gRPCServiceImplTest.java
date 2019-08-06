package com.cong.grpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class gRPCServiceImplTest {

    @Autowired
    private gRPCClientForTest client;

    private String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjb25nIiwiaWF0IjoxNTY1MDI0ODc3LCJleHAiOjE1NjUxMTEyNzd9.qbOJJY9GqcOhqaXrvxn190wIvZeIBWb97B2WLFsl-aILUEc-COu_SAaH72g0R_WDNJhz_GUddKzU7PtYhxup3w";
    @Test
    public void testAuthenticateUser(){
        assertThat(client.authenticateUser("Hello","Hello").getData().getType()).isEqualTo("Bearer");
        assertThat(client.authenticateUser("cong","cong123").getStatus()).isEqualTo("FAIL");
        assertThat(client.authenticateUser("cong123","123456789").getStatus()).isEqualTo("FAIL");
    }

    @Test
    public void testRegisterUser(){
        String randomUser = UUID.randomUUID().toString();
        assertThat(client.registerUser("RPCName "+randomUser,"RPCUsername"+randomUser,"password",randomUser+"@email.com").getStatus()).isEqualTo("SUCCESS");
        assertThat(client.registerUser("RPCCong","cong","password","cong@gmail.com").getStatus()).isEqualTo("FAIL");
    }

    @Test
    public void testPlayGame(){
        assertThat(client.playGame(token,3).getStatus()).isEqualTo("SUCCESS");
        assertThat(client.playGame("token",2).getStatus()).isEqualTo("FAIL");
        assertThat(client.playGame("token",-2).getStatus()).isEqualTo("FAIL");
    }

    @Test
    public void testGetHistory(){
        assertThat(client.getHistory(token).getStatus()).isEqualTo("SUCCESS");
        assertThat(client.getHistory("token").getStatus()).isEqualTo("FAIL");
    }

    @Test
    public void testGetRanking(){
        assertThat(client.getRanking(token).getStatus()).isEqualTo("SUCCESS");
        assertThat(client.getRanking("token").getStatus()).isEqualTo("FAIL");
    }
}
