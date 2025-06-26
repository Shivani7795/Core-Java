package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.CampingAccessoryDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoryRepositoryImpl implements CampingAccessoryRepository{

    public Collection<CampingAccessoryDTO> findAllAccessory() {

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

        return collection;
    }

    public void findCooking(Collection<CampingAccessoryDTO> collection) {
        System.out.println("Using for-each loop:");
        for (CampingAccessoryDTO dto : collection) {
            if (dto.getType().equalsIgnoreCase("Cooking")) {
                System.out.println("Brand: " + dto.getBrand() + ", Price: " + dto.getPrice());
            }
        }
    }

    public void findBelowWeight(Collection<CampingAccessoryDTO> collection) {
        System.out.println("Using Iterator - Items below 1kg weight:");
        Iterator<CampingAccessoryDTO> iterator = collection.iterator();
        while (iterator.hasNext()) {
            CampingAccessoryDTO dto = iterator.next();
            if (dto.getWeight() < 1.0) {
                System.out.println(dto.getName() + " - " + dto.getWeight() + "kg");
            }
        }
    }
}
