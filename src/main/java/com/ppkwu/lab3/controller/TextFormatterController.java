package com.ppkwu.lab3.controller;

import com.ppkwu.lab3.service.StringStatsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextFormatterController {

    @Autowired
    StringStatsClient service;

    @GetMapping("/api/json/string")
    public String getStringStatsAsJson(@RequestParam String str) {
        return service.getJson(str).block();
    }

}
