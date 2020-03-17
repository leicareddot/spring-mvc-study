package com.atoz_develop.springmvchttpmessageconverter;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    // HTTP 메시지 컨버터 설정 방법 1
    // 기본 컨버터들 사용 X
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    // HTTP 메시지 컨버터 설정 방법 2
    // 기본 컨버터들 + 추가
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    // HTTP 메시지 컨버터 설정 방법 3
    // 의존성 추가로 컨버터 등록하기 (추천)
}
