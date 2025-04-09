package com.xworkz.encapsulation.internal;

public class SecondOccupation {

        public void modifyOccupation() {
            Occupation occupation = new Occupation();

            occupation.setTitle("Software Engineer");
            occupation.setField("Technology");
            occupation.setYearsOfExperience(5);
            occupation.setIsFullTime(true);
            occupation.setSalary(85000.00);

            System.out.println("Title: " + occupation.getTitle());
            System.out.println("Field: " + occupation.getField());
            System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
            System.out.println("Full-Time: " + occupation.isFullTime());
            System.out.println("Salary: " + occupation.getSalary());
        }
    }

