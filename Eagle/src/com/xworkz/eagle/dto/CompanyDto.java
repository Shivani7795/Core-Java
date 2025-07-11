package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class CompanyDto {
    private String name;
    private int regId;
    private String location;
    private CEODto ceo;
}
