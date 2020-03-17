package com.atoz_develop.springboot18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(SpringExtension.class)
//@WebMvcTest // 슬라이싱 테스트 - 웹 관련 계층만 테스트
@SpringBootTest
@AutoConfigureMockMvc
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;    // @WebMvcTest 또는 @AutoConfigureMockMvc에 의해 MockMvc 주입

    @Test
    public void hello() throws Exception {
        this.mockMvc.perform(get("/hello/leica"))   // 요청
                .andDo(print()) // 요청과 응답 출력
                .andExpect(content().string("hello leica"));    // 기대값
    }

    @Test
    public void hello2() throws Exception {
        this.mockMvc.perform(get("/hello/leica")   // 요청
                .param("name", "leica"))    // Request Parameter
                .andDo(print()) // 요청과 응답 출력
                .andExpect(content().string("hello leica"));    // 기대값
    }
}