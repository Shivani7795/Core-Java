package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class PresidentDto {
    private String name;
    private int age;
    private String party;
    private DriverDto driver;
}
