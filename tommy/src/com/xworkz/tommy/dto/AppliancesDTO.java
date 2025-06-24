package com.xworkz.tommy.dto;

public class AppliancesDTO {

    private String name;
    private String brand;
    private double price;
    private int warranty;
    private String color;

    public AppliancesDTO() {
        System.out.println("Constructor in AppliancesDTO");
    }

    public AppliancesDTO(String name, String brand, double price, int warranty, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
        this.color = color;
        System.out.println("AppliancesDTO created with all values");
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    public String getColor() {
        return color;
    }

    public void details() {
        System.out.println("Appliance Details:");
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Color: " + color);
        System.out.println("-------------------------");
    }
}
