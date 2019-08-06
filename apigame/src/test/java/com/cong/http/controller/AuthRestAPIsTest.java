package com.cong.http.controller;

import com.cong.http.message.request.LoginForm;
import com.cong.http.message.request.SignUpForm;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AuthRestAPIsTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testAuthenticateUser() throws Exception{
        mvc.perform( MockMvcRequestBuilders
                .post("/api/auth/signin")
                .content(objectMapper.writeValueAsString(new LoginForm("cong","123456789")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isOk());
        mvc.perform(MockMvcRequestBuilders
                .post("/api/auth/signin")
                .content(objectMapper.writeValueAsString(new LoginForm("     ","       ")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isBadRequest());
        mvc.perform( MockMvcRequestBuilders
                .post("/api/auth/signin")
                .content(objectMapper.writeValueAsString(new LoginForm("","")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testRegisterUser() throws Exception{
        String randomUser = UUID.randomUUID().toString();
        mvc.perform( MockMvcRequestBuilders
                .post("/api/auth/signup")
                .content(objectMapper.writeValueAsString(new SignUpForm("Name"+randomUser,"username"+randomUser,randomUser+"@email.com","password")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isOk());

        randomUser = UUID.randomUUID().toString();
        mvc.perform( MockMvcRequestBuilders
                .post("/api/auth/signup")
                .content(objectMapper.writeValueAsString(new SignUpForm(" ","  ",randomUser+"@email.com","  ")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isBadRequest());

        randomUser = UUID.randomUUID().toString();
        mvc.perform( MockMvcRequestBuilders
                .post("/api/auth/signup")
                .content(objectMapper.writeValueAsString(new SignUpForm("Name"+randomUser,"username "+randomUser,randomUser+"email.com","password")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.ALL))
                .andExpect(status().isBadRequest());
    }
}
