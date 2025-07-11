package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class HouseDto {
    private String address;
    private int houseNumber;
    private String type;
    private SecurityDto security;
}
