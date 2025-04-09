package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Jet;
public class ExternalJet {

    public void readJetDetails() {
        Jet jet = new Jet();

        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military: " + jet.isMilitary());
    }
}