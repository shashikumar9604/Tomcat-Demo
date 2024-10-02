package com.example.Git_Tomact_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String hello() {
        return "hello this created by shashi to deploye the tomact application ";
    }

}
