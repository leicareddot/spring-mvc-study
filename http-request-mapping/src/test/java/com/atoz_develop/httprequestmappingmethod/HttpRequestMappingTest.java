package com.atoz_develop.httprequestmappingmethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class HttpRequestMappingTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
    }

    @Test
    public void hello2_isMethodNotAllowed() throws Exception {
        mockMvc.perform(post("/hello2"))
                .andDo(print())
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void hello2() throws Exception {
        mockMvc.perform(get("/hello2"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void hello3_isMethodNotAllowed() throws Exception {
        mockMvc.perform(post("/hello3"))
                .andDo(print())
                .andExpect(status().isMethodNotAllowed());
    }
}