package com.ppkwu.lab3.controller;

import com.ppkwu.lab3.service.JsonConverter;
import com.ppkwu.lab3.service.StringStatsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextFormatterController {

    @Autowired
    private StringStatsClient service;

    @Autowired
    private JsonConverter jsonConverter;

    @GetMapping("/api/json/string")
    public String getStringStatsAsJson(@RequestParam String str) {
        return service.getJson(str).block();
    }

    @GetMapping(value = "/api/xml/string", produces = {MediaType.APPLICATION_XML_VALUE})
    public String getStringStatsAsXml(@RequestParam String str) {
        return jsonConverter.toXml(service.getJson(str).block());
    }

    @GetMapping("/api/csv/string")
    public String getStringStatsAsCsv(@RequestParam String str) {
        return jsonConverter.toCsv(service.getJson(str).block());
    }

}
