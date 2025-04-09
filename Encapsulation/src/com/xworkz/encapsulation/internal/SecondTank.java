package com.xworkz.encapsulation.internal;

public class SecondTank {

        public void modifyTank() {
            Tank tank = new Tank();

            tank.setType("Battle Tank");
            tank.setModel("T-90");
            tank.setCapacity(4);
            tank.setArmored(true);
            tank.setWeight(46.5);

            System.out.println("Type: " + tank.getType());
            System.out.println("Model: " + tank.getModel());
            System.out.println("Capacity: " + tank.getCapacity());
            System.out.println("Armored: " + tank.isArmored());
            System.out.println("Weight: " + tank.getWeight());
        }
    }

