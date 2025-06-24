package com.xworkz.tommy.dto;

public class CampingAccessoryDTO {

    private String name;
    private String brand;
    private double price;
    private String type;
    private double weight;

    public CampingAccessoryDTO() {
        System.out.println("Constructor in CampingAccessoryDTO");
    }

    public CampingAccessoryDTO(String name, String brand, double price, String type, double weight) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.weight = weight;
        System.out.println("CampingAccessoryDTO created with all values");
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

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }


    public void details() {
        System.out.println("Camping Accessory Details:");
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
    }
}
