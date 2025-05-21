package com.xworkz.barbie.dto;

public class ProductDto {
    private String name;
    private String type;
    private String incomingPrice;
    private String sellingPrice;
    private String mrp;
    private String description;
    private String brand;
    private String quantity;
    private String color;
    private String weight;
    private String manufDate;
    private String warranty;
    private boolean returnPolicy;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getIncomingPrice() {
        return incomingPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public String getMrp() {
        return mrp;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public String getManufDate() {
        return manufDate;
    }

    public String getWarranty() {
        return warranty;
    }

    public boolean isReturnPolicy() {
        return returnPolicy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIncomingPrice(String incomingPrice) {
        this.incomingPrice = incomingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setManufDate(String manufDate) {
        this.manufDate = manufDate;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void setReturnPolicy(boolean returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", incomingPrice='" + incomingPrice + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", mrp='" + mrp + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity='" + quantity + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manufDate='" + manufDate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnPolicy=" + returnPolicy +
                '}';
    }
}


