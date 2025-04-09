package com.xworkz.encapsulation.internal;

public class SecondMutant {

    public void modifyMutant() {
        Mutant mutant = new Mutant();

        mutant.setName("deadpool");
        mutant.setPower("accelerated healing factor");
        mutant.setImmortal(true);
        mutant.setIsHero(true);
        mutant.setAge(60);

        System.out.println("Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Immortal: " + mutant.isImmortal());
        System.out.println("Is Hero: " + mutant.isHero());
        System.out.println("Age: " + mutant.getAge());
    }
}

