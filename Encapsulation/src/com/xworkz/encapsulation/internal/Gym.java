package com.xworkz.encapsulation.internal;

public class Gym {
    private String name;
    private String location;
    private int numberOfEquipment;
    private boolean isOpen;
    private double membershipFee;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEquipment() {
        return numberOfEquipment;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfEquipment(int numberOfEquipment) {
        this.numberOfEquipment = numberOfEquipment;
    }

    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }
}