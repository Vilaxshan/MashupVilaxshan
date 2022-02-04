package com.example.mashup.Models;


import java.util.ArrayList;

public class WeatherResponse {

    private Main main;
    private ArrayList<Weather> weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

}
