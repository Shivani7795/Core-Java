package com.xworkz.Weather.Repository;

import com.xworkz.Weather.Dto.WeatherDto;

public interface WeatherRepository {
    String persist(WeatherDto weatherDto);
}