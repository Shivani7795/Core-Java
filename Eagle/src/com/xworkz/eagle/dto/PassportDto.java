package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class PassportDto {
    private String number;
    private String issueDate;
    private String expiryDate;
    private CountryDto country;
}
