package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class control {
    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "SSSS";
    }
}
