package com.xworkz.AnnualEvent.Dto;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data

public class AnnualEventDto {
    private int id;
    private String instituteName;
    private String Location;
    private String guestName;
    private LocalDate eDate;
    private int chairs;
    private Timestamp bookedTime = Timestamp.valueOf(LocalDateTime.now());

}

