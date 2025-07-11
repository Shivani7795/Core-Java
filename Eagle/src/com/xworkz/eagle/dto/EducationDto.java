package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class EducationDto {

    private String qualification;
    private String university;
    private int yearOfPassing;
    private double percentage;
}
