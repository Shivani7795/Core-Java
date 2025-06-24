package com.xworkz.tommy.dto;

public class NailPolishDTO {

    private String brand;
    private String color;
    private double price;
    private String shape;
    private int quantity;

    public NailPolishDTO() {
        System.out.println("Constructor in NailPolishDTO");
    }

    public NailPolishDTO(String brand, String color, double price, String shape, int quantity) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.quantity = quantity;
        System.out.println("NailPolishDTO created with all values");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getShape() {
        return shape;
    }

    public int getQuantity() {
        return quantity;
    }

    public void details() {
        System.out.println("Nail Polish Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Shape: " + shape);
        System.out.println("Quantity: " + quantity + " ml");
    }
}
