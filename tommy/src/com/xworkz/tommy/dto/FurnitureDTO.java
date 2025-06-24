package com.xworkz.tommy.dto;

public class FurnitureDTO {

    private String name;
    private String material;
    private double price;
    private String type;
    private int warrantyInYears;

    public FurnitureDTO() {
        System.out.println("Constructor in FurnitureDTO");
    }

    public FurnitureDTO(String name, String material, double price, String type, int warrantyInYears) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.type = type;
        this.warrantyInYears = warrantyInYears;
        System.out.println("FurnitureDTO created with all values");
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getWarrantyInYears() {
        return warrantyInYears;
    }

    public void details() {
        System.out.println("Furniture Details:");
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warrantyInYears + " years");
    }
}
