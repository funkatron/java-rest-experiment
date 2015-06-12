package com.graphstory.rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RestTest {
    public static void main(String args[]) throws UnirestException {
        HttpResponse<JsonNode> jsonResponse;

        System.out.println("GET http://httpbin.org/ip");

        jsonResponse = Unirest.get("http://httpbin.org/ip")
                .header("accept", "application/json")
                .asJson();

        System.out.println(jsonResponse.getBody());
    }
}
