package com.atoz_develop.httprequestmappingmethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(method = RequestMethod.GET) // 모든 핸들러가 GET 메소드만 처리
public class MethodMappingController {

    // 모든 HTTP Method 허용
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    // HTTP Method 설정
    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    @ResponseBody
    public String hello2() {
        return "hello2";
    }

    // 여러 개의 HTTP Method 설정
    @RequestMapping(value = "hello3", method = {RequestMethod.GET, RequestMethod.PUT})
    @ResponseBody
    public String hello3() {
        return "hello3";
    }

    // GetMapping
    // @@RequestMapping(value = "...", method = RequestMethod.GET) 과 동일
    @GetMapping("hello4")
    @ResponseBody
    public String hello4() {
        return "hello4";
    }
}
