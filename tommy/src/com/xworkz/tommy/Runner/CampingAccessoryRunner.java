package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.CampingAccessoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessoryDTO item1 = new CampingAccessoryDTO("Sleeping Bag", "Quechua", 2200, "Comfort", 1.5);
        CampingAccessoryDTO item2 = new CampingAccessoryDTO("Tent", "Wildcraft", 5800, "Shelter", 4.2);
        CampingAccessoryDTO item3 = new CampingAccessoryDTO("Camping Stove", "Coleman", 3100, "Cooking", 2.1);
        CampingAccessoryDTO item4 = new CampingAccessoryDTO("Hiking Backpack", "Decathlon", 1990, "Storage", 1.8);
        CampingAccessoryDTO item5 = new CampingAccessoryDTO("Water Bottle", "Milton", 400, "Hydration", 0.5);
        CampingAccessoryDTO item6 = new CampingAccessoryDTO("Flashlight", "Eveready", 350, "Lighting", 0.3);
        CampingAccessoryDTO item7 = new CampingAccessoryDTO("Portable Chair", "CampMaster", 1600, "Seating", 2.7);
        CampingAccessoryDTO item8 = new CampingAccessoryDTO("First Aid Kit", "RedCross", 700, "Safety", 0.9);
        CampingAccessoryDTO item9 = new CampingAccessoryDTO("Insect Repellent", "Odomos", 120, "Protection", 0.2);
        CampingAccessoryDTO item10 = new CampingAccessoryDTO("Portable Grill", "Weber", 4200, "Cooking", 3.5);

        Collection<CampingAccessoryDTO> collection = new ArrayList<>();
        collection.add(item1);
        collection.add(item2);
        collection.add(item3);
        collection.add(item4);
        collection.add(item5);
        collection.add(item6);
        collection.add(item7);
        collection.add(item8);
        collection.add(item9);
        collection.add(item10);

        for (CampingAccessoryDTO accessory : collection) {
            accessory.details();
            System.out.println("----------------");
        }
    }
}
