package com.gibuncheong.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/current")
    public String getCurrentWeather() {
        return "오늘의 날씨는 맑음입니다 ☀️";
    }
}