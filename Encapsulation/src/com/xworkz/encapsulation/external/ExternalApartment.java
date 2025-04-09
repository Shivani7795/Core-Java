package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Apartment;

public class ExternalApartment {

    public void readApartmentDetails() {
        Apartment apartment = new Apartment();

        System.out.println("Name: " + apartment.getName());
        System.out.println("Address: " + apartment.getAddress());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
        System.out.println("Has Parking: " + apartment.hasParking());
        System.out.println("Rent: $" + apartment.getRent());
    }
}
