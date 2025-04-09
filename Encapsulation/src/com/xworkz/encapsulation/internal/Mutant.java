package com.xworkz.encapsulation.internal;

public class Mutant {
    private String name;
    private String power;
    private boolean immortal;
    private boolean isHero;
    private int age;

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public boolean isHero() {
        return isHero;
    }

    public int getAge() {
        return age;
    }


    void setName(String name) {
        this.name = name;
    }

    void setPower(String power) {
        this.power = power;
    }

    void setImmortal(boolean immortal) {
        this.immortal = immortal;
    }

    void setIsHero(boolean isHero) {
        this.isHero = isHero;
    }

    void setAge(int age) {
        this.age = age;
    }
}

