package com.xworkz.eagle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class DetailsDto {
    private String detailType;
    private String status;
    private EducationDto education;
    private String remarks;



}
