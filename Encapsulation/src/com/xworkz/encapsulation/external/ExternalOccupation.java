package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Occupation;

public class ExternalOccupation {

    public void readOccupationDetails() {
        Occupation occupation = new Occupation();

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Field: " + occupation.getField());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
        System.out.println("Full-Time: " + occupation.isFullTime());
        System.out.println("Salary: " + occupation.getSalary());
    }
}