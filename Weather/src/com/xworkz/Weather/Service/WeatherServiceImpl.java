package com.xworkz.Weather.Service;

import com.xworkz.Weather.Dto.WeatherDto;

import com.xworkz.Weather.Repository.WeatherRepository;
import com.xworkz.Weather.Repository.WeatherRepositoryImpl;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WeatherServiceImpl implements WeatherService {
        @Override
        public String save(WeatherDto weatherDto) {

            if (weatherDto == null) {
                System.err.println("climateDto is null");
                return "Failed";
            }

            if (weatherDto.getPlaceName() == null) {
                System.err.println("Place name is null");
                return "Failed";
            }
            if (weatherDto.getWeather() == null) {
                System.err.println("Weather is null");
                return "Failed";
            }
            if (weatherDto.getMinTemp() == 0) {
                System.err.println("Min temperature is missing or 0");
                return "Failed";
            }
            if (weatherDto.getMaxTemp() == 0) {
                System.err.println("Max temperature is missing or 0");
                return "Failed";
            }
            if (weatherDto.getCloudy() == null) {
                System.err.println("Cloudy value is null");
                return "Failed";
            }
            if (weatherDto.getRaining() == null) {
                System.err.println("Raining value is null");
                return "Failed";
            }
            if (weatherDto.getRainMm() == 0) {
                System.err.println("Rain in mm is missing or 0");
                return "Failed";
            }
            if (weatherDto.getHumidity() == 0) {
                System.err.println("Humidity is missing or 0");
                return "Failed";
            }
            if (weatherDto.getWindSpeed() == 0) {
                System.err.println("Wind speed is missing or 0");
                return "Failed";
            }
            if (weatherDto.getSunrise() == null) {
                System.err.println("Sunrise time is null");
                return "Failed";
            }
            if (weatherDto.getSunset() == null) {
                System.err.println("Sunset time is null");
                return "Failed";
            }
            if (weatherDto.getMoonrise() == null) {
                System.err.println("Moonrise time is null");
                return "Failed";
            }
            if (weatherDto.getMoonset() == null) {
                System.err.println("Moonset time is null");
                return "Failed";
            }
            if (weatherDto.getRainStart() == null) {
                System.err.println("Rain start time is null");
                return "Failed";
            }
            if (weatherDto.getRainEnd() == null) {
                System.err.println("Rain end time is null");
                return "Failed";
            }
            if (weatherDto.getPrecipitation() == 0) {
                System.err.println("Precipitation is missing or 0");
                return "Failed";
            }

            WeatherRepository weatherRepository = new WeatherRepositoryImpl();
            weatherRepository.persist(weatherDto);

            return "Success";
        }
    }





