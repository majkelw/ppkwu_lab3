package com.ppkwu.lab3.service;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

@Service
public class JsonConverter {

    public String toXml(String json) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <data>" + XML.toString(new JSONObject(json)) + "</data>";
    }

    public String toCsv(String json) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(new JSONObject(json));
        return CDL.toString(jsonArray);
    }

}
