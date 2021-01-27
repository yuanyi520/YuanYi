package com.yuanyi.artemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpPageController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
