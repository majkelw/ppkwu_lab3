package com.ppkwu.lab3.service;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

@Service
public class JsonConverter {

    public String toXml(String json) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <data>" + XML.toString(new JSONObject(json)) + "</data>";
    }

}
