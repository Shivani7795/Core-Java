package com.xworkz.repunzel.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AnotherApplicationRunner {
    public static void main(String[] args) {
        List<String> appNames = new ArrayList<>();
        appNames.add("Instagram");
        appNames.add("YouTube");
        appNames.add("Telegram");
        appNames.add("Google");
        appNames.add("Spotify");
        appNames.add("WhatsApp");
        appNames.add("SubwaySurfers");
        appNames.add("Dr.Driving");
        appNames.add("Pinterest");
        appNames.add("Album");

        ListIterator<String> listIterator= appNames.listIterator();

        System.out.println("traverse in forward direction ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------------- ");
        System.out.println("traverse in backward direction ");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("--------------------------- ");
        System.out.println("forward traverse from 4th index direction ");
        int index=4;
        while(listIterator.hasNext()&& listIterator.nextIndex()<index) {
            listIterator.next();
        }
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("--------------------------- ");
        System.out.println("backward traverse from 5th index direction ");
        int theIndex = 5;
        while(listIterator.hasPrevious()&&listIterator.previousIndex()>theIndex) {
                   listIterator.previous();
               }
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }

        System.out.println("--------------------------- ");
        System.out.println("backward traverse from 5th index direction ");
        ListIterator<String> listIterator1= appNames.listIterator(2);
        while(listIterator1.hasPrevious()){
            System.out.println(listIterator1.previous());
        }
        System.out.println("-------------------");
        System.out.println("forward traverse from 8th index direction ");
        ListIterator<String> listIterator2= appNames.listIterator(8);
        while(listIterator2.hasNext()){
            System.out.println(listIterator2.next());
        }
        System.out.println("-------------------");
        System.out.println("adding and removing element");
                ListIterator<String> listIterator3= appNames.listIterator();
        while(listIterator3.hasNext()) {
            String app = listIterator3.next();
            if (app.equalsIgnoreCase("Pinterest")) {
                listIterator3.add("Picsart");
            }
            if (app.equalsIgnoreCase("Telegram")) {
                listIterator3.remove();
            }
            if (app.equalsIgnoreCase("Instagram")) {
                listIterator3.set("outlook");
            }
        }
        System.out.println("updated list:");
        for (String apps : appNames) {
            System.out.println(apps);
        }
    }
}
