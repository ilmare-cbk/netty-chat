package com.example.nettychatserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

    @RequestMapping(value = "/home")
    public String home() {
        return "index";
    }
}
