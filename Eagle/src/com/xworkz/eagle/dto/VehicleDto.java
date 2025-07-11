package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class VehicleDto {
    private String model;
    private String number;
    private String type;
    private CompanyDto company;
}
