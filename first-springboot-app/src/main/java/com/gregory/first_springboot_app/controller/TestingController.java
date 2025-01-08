package com.gregory.first_springboot_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somethingelse")
public class TestingController {

    @GetMapping
    public String getMessageFromServer() {
        return "this is from springboot";
    }

    @GetMapping("/somethingelse")
    public String fuckyou(){
        return "ok";
    }



}
