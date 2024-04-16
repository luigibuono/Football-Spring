package com.example.football.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class AdminController {
    @RequestMapping("/admin")
    public String index(){

        return "admin";
    }



    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}

