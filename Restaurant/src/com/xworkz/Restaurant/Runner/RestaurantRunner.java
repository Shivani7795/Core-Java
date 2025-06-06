package com.xworkz.Restaurant.Runner;

import com.xworkz.Restaurant.dto.RestaurantDto;
import com.xworkz.Restaurant.Service.RestaurantService;
import com.xworkz.Restaurant.Service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto = new RestaurantDto();

        try {
            restaurantDto.setRestaurantName("1");
            restaurantDto.setLocation(null);
            restaurantDto.setEmailId(null);
            restaurantDto.setContactDetails(null);
            restaurantDto.setRating(2.5f);
            restaurantDto.setFoodMenu(new String[]{});
            restaurantDto.setType(null);
            restaurantDto.setOpeningTime(LocalTime.of(8, 30));
            restaurantDto.setClosingTime(LocalTime.of(13, 0));
            restaurantDto.setBookedDate(LocalDate.now().minusDays(1));
            restaurantDto.setBookedTime(LocalTime.of(8, 0));
        } catch (Exception e) {
            System.err.println("Error setting DTO values: " + e.getMessage());
        }

        RestaurantService service = new RestaurantServiceImpl();
        boolean result = service.validate(restaurantDto);

        if (result) {
            System.out.println("Restaurant Details are correct");
        } else {
            System.out.println("Restaurant Details are not correct");
        }
    }
}