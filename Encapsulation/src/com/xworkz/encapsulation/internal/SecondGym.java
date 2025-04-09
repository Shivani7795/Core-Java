package com.xworkz.encapsulation.internal;

public class SecondGym {

    public void modifyGym() {
        Gym gym = new Gym();

        gym.setName("Fitness Pro Gym");
        gym.setLocation("City Center");
        gym.setNumberOfEquipment(50);
        gym.setIsOpen(true);
        gym.setMembershipFee(2000.50);

        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Equipment: " + gym.getNumberOfEquipment());
        System.out.println("Open: " + gym.isOpen());
        System.out.println("Membership Fee: $" + gym.getMembershipFee());
    }
}
