package com.yuanyi.artemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JumpPageController {

    @GetMapping("/test")
    public String getTest(){
        return "Test";
    }
}
