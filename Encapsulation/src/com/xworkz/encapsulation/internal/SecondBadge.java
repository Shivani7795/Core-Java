package com.xworkz.encapsulation.internal;

public class SecondBadge {

        public void modifyBadge() {
            Badge badge = new Badge();

            badge.setId("A123");
            badge.setOwnerName("John Doe");
            badge.setDesignation("Manager");
            badge.setDepartment("Sales");
            badge.setIsActive(true);

            System.out.println("ID: " + badge.getId());
            System.out.println("Owner Name: " + badge.getOwnerName());
            System.out.println("Designation: " + badge.getDesignation());
            System.out.println("Department: " + badge.getDepartment());
            System.out.println("Is Active: " + badge.isActive());
        }
    }

