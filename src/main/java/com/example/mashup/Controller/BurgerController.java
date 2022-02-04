package com.example.mashup.Controller;

import com.example.mashup.Services.BurgerService;
import com.example.mashup.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @GetMapping("/burger")
    public ModelAndView showBurger() throws IOException, InterruptedException {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("burgers");

        mav.getModel().put("BurgerResponse", burgerService.getBurger());
        return mav;

    }
}
