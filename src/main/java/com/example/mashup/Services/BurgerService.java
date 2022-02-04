package com.example.mashup.Services;

import com.example.mashup.Models.Burger;
import com.example.mashup.Models.BurgerResponse;
import com.example.mashup.Models.WeatherResponse;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

@Service
public class BurgerService {

    public Burger[] getBurger() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://burgers1.p.rapidapi.com/burgers"))
                .header("x-rapidapi-host", "burgers1.p.rapidapi.com")
                .header("x-rapidapi-key", "f9cc6241bfmsh1699a4580c657d6p164b88jsn5fe19f13e7ae")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());



        Gson gson = new Gson();

        return gson.fromJson(response.body(), Burger[].class);

    }
}
