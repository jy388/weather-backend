package com.gibuncheong.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WeatherController {

    @GetMapping(value = "/api/weather/current", produces = "application/json; charset=UTF-8")
    public Map<String, Object> getWeather(
            @RequestParam(name = "lat", required = false, defaultValue = "0.0") double lat,
            @RequestParam(name = "lon", required = false, defaultValue = "0.0") double lon
    ) {
        return Map.of(
                "locationName", "안산시 상록구",
                "weather", "rainy",
                "temperature", 23,
                "humidity", 84,
                "feelLike", 26,
                "summary", "비가 먼저 나가서 기다리고 있어요.\n우산 꼭 챙겨서 만나요!"
        );
    }
}