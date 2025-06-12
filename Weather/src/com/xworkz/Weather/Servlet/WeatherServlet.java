package com.xworkz.Weather.Servlet;

import com.xworkz.Weather.Dto.WeatherDto;
import com.xworkz.Weather.Service.WeatherService;
import com.xworkz.Weather.Service.WeatherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/climate")

public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String placeName = req.getParameter("placeName");
        String weather = req.getParameter("weather");
        String minTemp = req.getParameter("minTemp");
        String maxTemp = req.getParameter("maxTemp");
        String cloudy = req.getParameter("cloudy");
        String raining = req.getParameter("raining");
        String rainMm = req.getParameter("rainMm");
        String humidity = req.getParameter("humidity");
        String windSpeed = req.getParameter("windSpeed");
        String sunrise = req.getParameter("sunrise");
        String sunset = req.getParameter("sunset");
        String moonrise = req.getParameter("moonrise");
        String moonset = req.getParameter("moonset");
        String rainStart = req.getParameter("rainStart");
        String rainEnd = req.getParameter("rainEnd");
        String precipitation = req.getParameter("precipitation");

        WeatherDto weatherDto=new WeatherDto(placeName,weather,Double.parseDouble(minTemp),Double.parseDouble(maxTemp),cloudy,raining,Double.parseDouble(rainMm),Double.parseDouble(humidity),
                Double.parseDouble(windSpeed),LocalTime.parse(sunrise),LocalTime.parse(sunset),LocalTime.parse(moonrise),LocalTime.parse(moonset),LocalTime.parse(rainStart),LocalTime.parse(rainEnd),Double.parseDouble(precipitation));

        WeatherService weatherService=new WeatherServiceImpl();
        String result=weatherService.save(weatherDto);
        System.out.println("Result: "+result);

    }
}
