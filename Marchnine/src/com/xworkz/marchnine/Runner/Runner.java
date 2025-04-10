package com.xworkz.marchnine.Runner;

import com.xworkz.marchnine.external.*;
import com.xworkz.marchnine.internal.*;

public class Runner {
    public static void main(String[] args){
        Food food = new GoodDayBiscuit();
        Snack snack = new GoodDayBiscuit();
        Biscuit biscuit = new GoodDayBiscuit();
        GoodDayBiscuit goodDayBiscuit = new GoodDayBiscuit();
        System.out.println();

        Organization organization = new Tap();
        Academy academy = new Tap();
        Tap tap = new Tap();
        System.out.println();

        Dish dish = new Omlette();
        SideDish sideDish = new Omlette();
        Omlette omlette = new Omlette();
        System.out.println();

        Human human = new Actor();
        Person person = new Actor();
        Actor actor = new Actor();
        System.out.println();

        Tool tool = new Revolver();
        Weapon weapon = new Revolver();
        Revolver revolver = new Revolver();
        System.out.println();

        Accessory accessory = new Sneaker();
        Shoe shoe = new Sneaker();
        Sneaker sneaker = new Sneaker();
        System.out.println();

        Product product = new Sofa();
        Furniture furniture = new Sofa();
        Sofa sofa = new Sofa();
        System.out.println();

        Thing thing = new Cactus();
        Plant plant = new Cactus();
        Cactus cactus = new Cactus();
        System.out.println();

        Security security = new Lock();
        Lock lock = new Lock();
        System.out.println();

        Light light = new LED();
        LED led = new LED();
        System.out.println();
    }
}

