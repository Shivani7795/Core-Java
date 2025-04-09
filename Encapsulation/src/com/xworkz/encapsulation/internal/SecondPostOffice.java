package com.xworkz.encapsulation.internal;

public class SecondPostOffice {

        public void modifyPostOffice() {
            PostOffice postOffice = new PostOffice();

            postOffice.setName("Central Post Office");
            postOffice.setLocation("Downtown");
            postOffice.setNumberOfEmployees(150);
            postOffice.setIsOperational(true);
            postOffice.setRevenue(2_500_000.75);

            System.out.println("Name: " + postOffice.getName());
            System.out.println("Location: " + postOffice.getLocation());
            System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
            System.out.println("Operational: " + postOffice.isOperational());
            System.out.println("Revenue: " + postOffice.getRevenue());
        }
    }
