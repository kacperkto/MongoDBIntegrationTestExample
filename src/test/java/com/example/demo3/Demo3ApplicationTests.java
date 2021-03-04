package com.example.demo3;

import com.jayway.jsonpath.JsonPath;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class Demo3ApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void getByID() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/603fd7d9fe1e8167c7a98fb2")).andDo(MockMvcResultHandlers.print())
                    .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.jsonPath("$._id", Matchers.is("603fd7d9fe1e8167c7a98fb2")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
