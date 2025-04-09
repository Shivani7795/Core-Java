package com.xworkz.encapsulation.internal;

public class Apartment {
    private String name;
    private String address;
    private int numberOfRooms;
    private boolean hasParking;
    private double rent;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean hasParking() {
        return hasParking;
    }

    public double getRent() {
        return rent;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    void setRent(double rent) {
        this.rent = rent;
    }
}
