package com.example.mashup.Controller;

import com.example.mashup.Services.BurgerService;
import com.example.mashup.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ModelAndView showWeather() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("current-weather");

        mav.getModel().put("WeatherResponse", weatherService.getWeather());
        return mav;

    }
}
