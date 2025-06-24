package com.xworkz.tommy.dto;


public class SareeDTO {
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
        System.out.println("SareeDTO created with all values");
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
}
