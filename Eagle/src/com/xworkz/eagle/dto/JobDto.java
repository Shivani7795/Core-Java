package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class JobDto {
    private String role;
    private double salary;
    private String department;
    private DetailsDto detail;
}
