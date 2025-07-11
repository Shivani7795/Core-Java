package com.xworkz.tommy.dto;

import lombok.ToString;

@ToString
public class SareeDTO implements Comparable<SareeDTO>{
    public SareeDTO() {
        System.out.println("constructor in SareeDTO");
    }
    private String occasionType;
    private String color;
    private double price;
    private String material;

    public SareeDTO(String occasionType, String color, int price, String material) {
        this.occasionType = occasionType;
        this.color = color;
        this.price = price;
        this.material = material;

    }

    public String getOccasionType() {
        return occasionType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
    public void details() {
        System.out.println("Saree Details:");
        System.out.println("Occasion Type: " + occasionType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);

    }

    @Override
    public int compareTo(SareeDTO o) {
        SareeDTO leftSide = this;
        SareeDTO rightSide=o;
        if(leftSide.price>rightSide.price){
            return 99;
        }else if(leftSide.price==rightSide.price){
            return 0;
        }
        return -99;
    }
}
