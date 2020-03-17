package com.atoz_develop.springmvcresourcehandler;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/mobile/**")   // 요청 패턴
                .addResourceLocations("classpath:/mobile/") // 찾을 리소스 위치
                // 캐시 관련 헤더가 응답헤더에 추가됨
                // 리소스가 변경되지 않았으면 10분동안 캐싱하도록 설정
                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
    }
}
