package com.xworkz.encapsulation.internal;
public class Jet {
    private String model;
    private String manufacturer;
    private double maxSpeed;
    private int capacity;
    private boolean isMilitary;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }
}
