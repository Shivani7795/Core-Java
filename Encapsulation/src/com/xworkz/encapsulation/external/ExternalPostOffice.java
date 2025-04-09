package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.PostOffice;

public class ExternalPostOffice {

    public void readPostOfficeDetails() {
        PostOffice postOffice = new PostOffice();

        System.out.println("Name: " + postOffice.getName());
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Operational: " + postOffice.isOperational());
        System.out.println("Revenue: " + postOffice.getRevenue());
    }
}