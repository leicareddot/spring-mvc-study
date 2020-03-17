package com.atoz_develop.springboot18;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /*
    스프링 부트에서는 Formatter를 빈으로 등록하면 addFormatters()를 override하지 않아도 자동 적용
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PersonFormatter());
    }*/
}
