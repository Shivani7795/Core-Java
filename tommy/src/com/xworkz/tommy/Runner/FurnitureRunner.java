package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.FurnitureDTO;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureDTO furniture1 = new FurnitureDTO("Sofa", "Leather", 45000, "Seating", 5);
        FurnitureDTO furniture2 = new FurnitureDTO("Dining Table", "Teak Wood", 30000, "Dining", 10);
        FurnitureDTO furniture3 = new FurnitureDTO("Bookshelf", "Plywood", 8000, "Storage", 3);
        FurnitureDTO furniture4 = new FurnitureDTO("Office Chair", "Plastic", 2500, "Seating", 2);
        FurnitureDTO furniture5 = new FurnitureDTO("Coffee Table", "Glass", 7000, "Table", 4);
        FurnitureDTO furniture6 = new FurnitureDTO("Wardrobe", "Engineered Wood", 18000, "Storage", 7);
        FurnitureDTO furniture7 = new FurnitureDTO("Study Desk", "Metal", 6500, "Work", 2);
        FurnitureDTO furniture8 = new FurnitureDTO("Recliner", "Fabric", 22000, "Seating", 6);
        FurnitureDTO furniture9 = new FurnitureDTO("TV Unit", "Solid Wood", 15000, "Entertainment", 4);
        FurnitureDTO furniture10 = new FurnitureDTO("Bed Frame", "Wrought Iron", 19000, "Sleeping", 5);

        Collection<FurnitureDTO> collection = new ArrayList<>();
        collection.add(furniture1);
        collection.add(furniture2);
        collection.add(furniture3);
        collection.add(furniture4);
        collection.add(furniture5);
        collection.add(furniture6);
        collection.add(furniture7);
        collection.add(furniture8);
        collection.add(furniture9);
        collection.add(furniture10);

        for (FurnitureDTO furniture : collection) {
            furniture.details();
            System.out.println("----------------");
        }
    }
}
