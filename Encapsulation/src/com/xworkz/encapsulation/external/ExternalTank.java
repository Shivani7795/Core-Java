package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Tank;

public class ExternalTank {


        public void readTankDetails() {
            Tank tank = new Tank();

            System.out.println("Type: " + tank.getType());
            System.out.println("Model: " + tank.getModel());
            System.out.println("Capacity: " + tank.getCapacity());
            System.out.println("Armored: " + tank.isArmored());
            System.out.println("Weight: " + tank.getWeight());
        }
    }

