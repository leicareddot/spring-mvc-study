package com.atoz_develop.springmvchttpmessageconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/message")
    public @ResponseBody String message(@RequestBody String body) {
        return "hello";
    }

    @GetMapping("/jsonMessage")
    @ResponseBody
    public Person jsonMessage(@RequestBody Person person) {
        return person;
    }
}
