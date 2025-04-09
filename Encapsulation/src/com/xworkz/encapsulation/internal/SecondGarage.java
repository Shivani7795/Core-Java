package com.xworkz.encapsulation.internal;

public class SecondGarage {

    public void modifyGarage() {
        Garage garage = new Garage();

        garage.setName("City Center Garage");
        garage.setLocation("Downtown");
        garage.setCapacity(120);
        garage.setIsOpen(true);
        garage.setDailyRevenue(4500.75);

        System.out.println("Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Open: " + garage.isOpen());
        System.out.println("Daily Revenue: $" + garage.getDailyRevenue());
    }
}
