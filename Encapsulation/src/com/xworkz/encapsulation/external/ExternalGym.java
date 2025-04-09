package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Gym;
public class ExternalGym {

    public void readGymDetails() {
        Gym gym = new Gym();

        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Equipment: " + gym.getNumberOfEquipment());
        System.out.println("Open: " + gym.isOpen());
        System.out.println("Membership Fee: $" + gym.getMembershipFee());
    }
}
