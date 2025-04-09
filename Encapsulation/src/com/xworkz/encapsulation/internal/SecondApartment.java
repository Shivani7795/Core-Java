package com.xworkz.encapsulation.internal;

public class SecondApartment {

    public void modifyApartment() {
        Apartment apartment = new Apartment();

        apartment.setName("Sunshine Residency");
        apartment.setAddress("123 Main Street, Downtown");
        apartment.setNumberOfRooms(3);
        apartment.setHasParking(true);
        apartment.setRent(30000.00);

        System.out.println("Name: " + apartment.getName());
        System.out.println("Address: " + apartment.getAddress());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
        System.out.println("Has Parking: " + apartment.hasParking());
        System.out.println("Rent: $" + apartment.getRent());
    }
}
