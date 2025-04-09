package com.xworkz.encapsulation.internal;
public class SecondJet {

    public void modifyJet() {
        Jet jet = new Jet();

        jet.setModel("F-22 Raptor");
        jet.setManufacturer("Lockheed Martin");
        jet.setMaxSpeed(2410.0); // in km/h
        jet.setCapacity(1);
        jet.setIsMilitary(true);

        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military: " + jet.isMilitary());
    }
}
