package com.example.mashup.Services;

import com.example.mashup.Models.WeatherResponse;
import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class WeatherService {


    public WeatherResponse getWeather() {

        String websiteResponse = "http://api.openweathermap.org/data/2.5/weather?q=zurich,ch&appid=2354da200c988d0f926356fe6e39a72f&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(websiteResponse, String.class);

        Gson gson = new Gson();

        return gson.fromJson(result, WeatherResponse.class);



    }
}
