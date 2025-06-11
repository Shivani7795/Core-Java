package com.xworkz.Red.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class StampedeCaseDto {
    public StampedeCaseDto(){
        System.out.println("constructor in StampedeCaseDto");
    }
    private String event;
    private int deaths;
    private int injuries;
    private String location;

}
