package com.xworkz.Weather.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class WeatherDto {
    public WeatherDto(String placeName, String weather, int i, int parseInt, String cloudy, String raining, int anInt, int parsed, int parsedInt){
        System.out.println("constructor in WeatherDto");
    }
    private String placeName;
    private String weather;
    private double minTemp;
    private double maxTemp;
    private String cloudy;
    private String raining;
    private double rainMm;
    private double humidity;
    private double windSpeed;
    private LocalTime sunrise;
    private LocalTime sunset;
    private LocalTime moonrise;
    private LocalTime moonset;
    private LocalTime rainStart;
    private LocalTime rainEnd;
    private double precipitation;
}



