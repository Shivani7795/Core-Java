package com.xworkz.sweety.runner;

import com.xworkz.sweety.dto.SweetDto;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {

        Set<SweetDto> sweetDetails = new HashSet<>();

        sweetDetails.add(new SweetDto("Rasgulla", 25, new String[]{"Milk", "Sugar", "Cardamom", "Ghee", "Saffron"}, 1, 5));
        sweetDetails.add(new SweetDto("Gulab Jamun", 30, new String[]{"Khoya", "Flour", "Sugar", "Ghee", "Rose"}, 0.5, 6));
        sweetDetails.add(new SweetDto("Ladoo", 15, new String[]{"Besan", "Sugar", "Cardamom", "Ghee", "Cashew"}, 1.75, 8));
        sweetDetails.add(new SweetDto("Barfi", 35, new String[]{"Milk", "Sugar", "Coconut", "Ghee", "Cardamom"}, 0.75, 4));
        sweetDetails.add(new SweetDto("Halwa", 20, new String[]{"Sooji", "Sugar", "Ghee", "Raisin", "Cashew"}, 1.5, 3));

        sweetDetails.add(new SweetDto("Jalebi", 18, new String[]{"Maida", "Sugar", "Saffron", "Ghee", "Citric Acid"}, 1.25, 6));
        sweetDetails.add(new SweetDto("Kaju Katli", 50, new String[]{"Cashew", "Sugar", "Ghee", "Cardamom", "Milk"}, 0.25, 2));
        sweetDetails.add(new SweetDto("Peda", 28, new String[]{"Milk", "Sugar", "Ghee", "Cardamom", "Almond"}, 2, 7));
        sweetDetails.add(new SweetDto("Imarti", 22, new String[]{"Urad Dal", "Ghee", "Sugar", "Saffron", "Rose"}, 0.5, 5));
        sweetDetails.add(new SweetDto("Mysore Pak", 40, new String[]{"Besan", "Sugar", "Ghee", "Water", "Soda"}, 1, 3));

        sweetDetails.add(new SweetDto("Sandesh", 33, new String[]{"Chenna", "Sugar", "Cardamom", "Saffron", "Pistachio"}, 0.75, 5));
        sweetDetails.add(new SweetDto("Cham Cham", 26, new String[]{"Chenna", "Sugar", "Semolina", "Ghee", "Rose"}, 1.25, 4));
        sweetDetails.add(new SweetDto("Modak", 38, new String[]{"Rice Flour", "Jaggery", "Coconut", "Cardamom", "Ghee"}, 0.25, 8));
        sweetDetails.add(new SweetDto("Kalakand", 29, new String[]{"Paneer", "Milk", "Sugar", "Cardamom", "Ghee"}, 1.75, 3));
        sweetDetails.add(new SweetDto("Besan Ladoo", 17, new String[]{"Besan", "Ghee", "Sugar", "Cardamom", "Almond"}, 2, 6));

        sweetDetails.add(new SweetDto("Soan Papdi", 19, new String[]{"Gram Flour", "Ghee", "Sugar", "Cardamom", "Pistachio"}, 0.5, 5));
        sweetDetails.add(new SweetDto("Milk Cake", 27, new String[]{"Milk", "Sugar", "Cardamom", "Ghee", "Citric Acid"}, 1.25, 4));
        sweetDetails.add(new SweetDto("Malpua", 21, new String[]{"Maida", "Sugar", "Fennel", "Ghee", "Milk"}, 0.75, 3));
        sweetDetails.add(new SweetDto("Rabri", 44, new String[]{"Milk", "Sugar", "Cardamom", "Almond", "Saffron"}, 1.5, 6));
        sweetDetails.add(new SweetDto("Rasmalai", 48, new String[]{"Milk", "Chenna", "Sugar", "Cardamom", "Saffron"}, 0.25, 2));

        sweetDetails.add(new SweetDto("Shrikhand", 39, new String[]{"Yogurt", "Sugar", "Cardamom", "Saffron", "Pistachio"}, 2, 5));
        sweetDetails.add(new SweetDto("Khaja", 23, new String[]{"Maida", "Sugar", "Ghee", "Salt", "Baking Soda"}, 0.5, 6));
        sweetDetails.add(new SweetDto("Balushahi", 31, new String[]{"Maida", "Ghee", "Yogurt", "Sugar", "Cardamom"}, 1.75, 3));
        sweetDetails.add(new SweetDto("Ghewar", 36, new String[]{"Maida", "Milk", "Sugar", "Ghee", "Saffron"}, 1, 5));
        sweetDetails.add(new SweetDto("Patishapta", 20, new String[]{"Rice Flour", "Coconut", "Jaggery", "Milk", "Cardamom"}, 1.25, 7));

        sweetDetails.add(new SweetDto("Tilkut", 14, new String[]{"Sesame", "Jaggery", "Sugar", "Ghee", "Cardamom"}, 0.75, 4));
        sweetDetails.add(new SweetDto("Chhena Poda", 34, new String[]{"Chenna", "Sugar", "Semolina", "Ghee", "Cardamom"}, 2, 5));
        sweetDetails.add(new SweetDto("Mohanthal", 45, new String[]{"Besan", "Sugar", "Ghee", "Milk", "Cardamom"}, 0.25, 6));
        sweetDetails.add(new SweetDto("Kheer Kadam", 32, new String[]{"Milk Powder", "Chenna", "Sugar", "Saffron", "Almond"}, 1.5, 3));
        sweetDetails.add(new SweetDto("Coconut Laddu", 24, new String[]{"Coconut", "Milk", "Sugar", "Cardamom", "Ghee"}, 0.5, 6));

        System.out.println("total no of sweets: " + sweetDetails.size());

        System.out.println("descending order using treeSet");
        Set<SweetDto> descOrder = new TreeSet<>((s1,s2)->Double.compare(s2.getPrice(),s1.getPrice()));
        descOrder.addAll(sweetDetails);
        descOrder.forEach(System.out::println);

        System.out.println("sort by name in desc");
        List<SweetDto> sName = new ArrayList<>(sweetDetails);
        sName.stream().sorted((s1,s2)->s2.getName().compareTo(s1.getName())).forEach(System.out::println);

        System.out.println("by price");
        sName.stream().sorted((p1,p2)->Double.compare(p2.getPrice(),p1.getPrice())).forEach(System.out::println);

        System.out.println("----------");
        List<SweetDto> conv = new LinkedList<>(sweetDetails);
        System.out.println("set to linkedList:");
        conv.forEach(System.out::println);

    }
}
