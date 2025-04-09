package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Mutant;

public class ExternalMutant {

        public void readMutantDetails() {
            Mutant mutant = new Mutant();

            System.out.println("Name: " + mutant.getName());
            System.out.println("Power: " + mutant.getPower());
            System.out.println("Immortal: " + mutant.isImmortal());
            System.out.println("Is Hero: " + mutant.isHero());
            System.out.println("Age: " + mutant.getAge());
        }
    }