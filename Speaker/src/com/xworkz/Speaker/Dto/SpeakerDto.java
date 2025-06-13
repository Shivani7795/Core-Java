package com.xworkz.Speaker.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class SpeakerDto {
    public SpeakerDto(){
        System.out.println("constructor in SpeakerDto");
    }
    private String brand;
    private String speakerType;
    private double price;
    private double wirelessRange;
    private String color;
    private String bluetooth;
}

