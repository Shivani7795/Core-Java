package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class DriverDto {
    private String name;
    private int licenseNo;
    private String experience;
    private VehicleDto vehicle;
}
