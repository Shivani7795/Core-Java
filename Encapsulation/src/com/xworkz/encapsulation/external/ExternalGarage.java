package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Garage;
public class ExternalGarage {

    public void readGarageDetails() {
        Garage garage = new Garage();

        System.out.println("Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Open: " + garage.isOpen());
        System.out.println("Daily Revenue: $" + garage.getDailyRevenue());
    }
}
