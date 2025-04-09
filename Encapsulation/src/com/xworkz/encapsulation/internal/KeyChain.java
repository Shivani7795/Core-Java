package com.xworkz.encapsulation.internal;

public class KeyChain {
    private String material;
    private String shape;
    private int keyCount;
    private boolean isPersonalized;
    private double price;

    public String getMaterial() {
        return material;
    }

    public String getShape() {
        return shape;
    }

    public int getKeyCount() {
        return keyCount;
    }

    public boolean isPersonalized() {
        return isPersonalized;
    }

    public double getPrice() {
        return price;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setShape(String shape) {
        this.shape = shape;
    }

    void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    void setIsPersonalized(boolean isPersonalized) {
        this.isPersonalized = isPersonalized;
    }

    void setPrice(double price) {
        this.price = price;
    }
}