package com.xworkz.encapsulation.internal;

public class Garage {
    private String name;
    private String location;
    private int capacity;
    private boolean isOpen;
    private double dailyRevenue;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void setDailyRevenue(double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }
}