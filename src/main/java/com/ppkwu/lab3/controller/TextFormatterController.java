package com.ppkwu.lab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextFormatterController {

    @GetMapping("/api/txt/string")
    public String printString(@RequestParam String str){
        return str;
    }

}
