package com.xworkz.Restaurant.dto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class RestaurantDto {
    public RestaurantDto() {
        System.out.println("RestaurantDto Constructor");
    }

    private String restaurantName;
    private String location;
    private Long contactDetails;
    private String emailId;
    private float rating;
    private String[] foodMenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;

}
