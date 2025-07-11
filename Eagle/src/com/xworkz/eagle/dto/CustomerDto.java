package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class CustomerDto {
    private String name;
    private int age;
    private String gender;
    private PassportDto passport;
}
