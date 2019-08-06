package com.cong.http.controller;

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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Random;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GameRestAPIsTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    private String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuYW0iLCJpYXQiOjE1NjQ5OTY0NTcsImV4cCI6MTU2NTA4Mjg1N30.IO0_ATSO3UalupbfrRlfUJ6T83EbuGkzCf56IimNJEoIxyHapE48ZO-MbVUubEYja7MjoTYPoJQeKLvIaC4_Wg";
    @Test
    public void testPlayGame() throws Exception{
        for(int i = 0;i<10;i++){
            mvc.perform( MockMvcRequestBuilders
                    .post("/api/users/play/1")
                    .header("Authorization",token)
                    .accept(MediaType.ALL))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty());
        }

        mvc.perform( MockMvcRequestBuilders
                .post("/api/users/play/-1")
                .header("Authorization",token)
                .accept(MediaType.ALL))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testGetHistory() throws Exception{
        mvc.perform( MockMvcRequestBuilders
                .get("/api/users/-1/history")
                .header("Authorization",token)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest());
        mvc.perform( MockMvcRequestBuilders
                .get("/api/users/2/history")
                .header("Authorization",token)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty());
    }

    @Test
    public void testTop100Users() throws Exception{
        mvc.perform( MockMvcRequestBuilders
                .get("/api/users/top100Win")
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization",token))
                .andDo(print())
                .andExpect(status().isOk());
        mvc.perform( MockMvcRequestBuilders
                .get("/api/users/top100Win")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnauthorized());
    }

}