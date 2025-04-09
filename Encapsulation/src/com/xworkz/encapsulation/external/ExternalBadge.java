package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Badge;

public class ExternalBadge {

    public void readBadgeDetails() {
        Badge badge = new Badge();

        System.out.println("ID: " + badge.getId());
        System.out.println("Owner Name: " + badge.getOwnerName());
        System.out.println("Designation: " + badge.getDesignation());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Is Active: " + badge.isActive());
    }
}