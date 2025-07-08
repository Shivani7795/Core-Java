package com.xworkz.repunzel.Runner;

import java.util.HashMap;
import java.util.Map;

public class CRUDOpMapRunner {
    public static void main(String[] args) {
        Map<Integer,String> colors =new HashMap<>();
        colors.put(1,"pink");
        colors.put(2,"black");
        colors.put(3,"white");
        colors.put(4,"blue");
        colors.put(5,"orange");
        colors.put(6,"purple");
        colors.put(7,"yellow");
        colors.put(8,"red");
        colors.put(9,"gray");

        for(String names: colors.values()){
            System.out.println(names);
        }
        System.out.println("------------------");
        System.out.println("to Read");
        System.out.println("the color at 1 st index:"+colors.get(1));
        System.out.println("------------------");

        System.out.println("to update");
        System.out.println("update black:"+colors.put(2,"silver"));
        System.out.println("------------------");

        System.out.println("to delete");
        System.out.println("removing gray:"+colors.remove(9));
        System.out.println("------------------");

        System.out.println(colors);


    }
}

