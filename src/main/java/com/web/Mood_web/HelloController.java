package com.web.Mood_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import  java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/some/data")
    public HashMap<String, String> returnData(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("firstAttribut", "Piece of data");
        map.put("secondAttribut", "More data");
        return map;
    }

}
