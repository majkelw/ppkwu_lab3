package com.ppkwu.lab3.controller;

import com.ppkwu.lab3.service.JsonConverterService;
import com.ppkwu.lab3.service.StringStatsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonConverterController {

    @Autowired
    private StringStatsClient service;

    @Autowired
    private JsonConverterService jsonConverterService;

    @GetMapping(value = "/api/json/string", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getStringStatsAsJson(@RequestParam String str) {
        return service.getJson(str).block();
    }

    @GetMapping(value = "/api/xml/string", produces = {MediaType.APPLICATION_XML_VALUE})
    public String getStringStatsAsXml(@RequestParam String str) {
        return jsonConverterService.toXml(service.getJson(str).block());
    }

    @GetMapping(value = "/api/csv/string", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getStringStatsAsCsv(@RequestParam String str) {
        return jsonConverterService.toCsv(service.getJson(str).block());
    }

    @GetMapping(value = "/api/txt/string", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getStringStatsAsTxt(@RequestParam String str) {
        return jsonConverterService.toTxt(service.getJson(str).block());
    }

}
