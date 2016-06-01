package me.bo0tzz.chesterlearner;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.net.URLEncoder;

/**
 * Created by bo0tzz on 1-6-2016.
 */
public class ChesterHandler {
    private static String API = "http://chester.chat/api?q=";

    public static void process(String entry) {
        entry = URLEncoder.encode(entry);
        HttpResponse<JsonNode> response;
        try {
            response = Unirest.get(API + entry).asJson();
        } catch (UnirestException ex) {
            ex.printStackTrace();
        }
    }
}
