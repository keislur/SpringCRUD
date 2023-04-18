package com.SpringCRUD.SringCRUD.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}