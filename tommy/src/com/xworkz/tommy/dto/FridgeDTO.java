package com.xworkz.tommy.dto;

public class FridgeDTO {
    private String brand;
    private String type;
    private int price;

    public FridgeDTO() {
        System.out.println("No-arg constructor in FridgeDTO");
    }

    public FridgeDTO(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("FridgeDTO created with values");
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
    }
}
