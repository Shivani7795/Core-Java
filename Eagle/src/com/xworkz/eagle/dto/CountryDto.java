package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class CountryDto {
    private String name;
    private String code;
    private String continent;
    private PresidentDto president;
}