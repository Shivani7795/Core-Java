package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.NailPolishDTO;

import java.util.ArrayList;
import java.util.Collection;

public class NailPolishRunner {
    public static void main(String[] args) {

        NailPolishDTO nail1 = new NailPolishDTO("Lakme", "Red", 120.0, "Round", 9);
        NailPolishDTO nail2 = new NailPolishDTO("Maybelline", "Pink", 140.0, "Square", 10);
        NailPolishDTO nail3 = new NailPolishDTO("Colorbar", "Purple", 160.0, "Oval", 11);
        NailPolishDTO nail4 = new NailPolishDTO("Elle 18", "Black", 90.0, "Cylindrical", 8);
        NailPolishDTO nail5 = new NailPolishDTO("Nykaa", "Blue", 180.0, "Cone", 12);
        NailPolishDTO nail6 = new NailPolishDTO("Revlon", "White", 200.0, "Dome", 9);
        NailPolishDTO nail7 = new NailPolishDTO("Faces Canada", "Green", 150.0, "Flat", 10);
        NailPolishDTO nail8 = new NailPolishDTO("Swiss Beauty", "Gold", 210.0, "Oval", 13);
        NailPolishDTO nail9 = new NailPolishDTO("Sugar", "Brown", 170.0, "Hex", 10);
        NailPolishDTO nail10 = new NailPolishDTO("Inglot", "Maroon", 250.0, "Rectangle", 15);

        Collection<NailPolishDTO> collection = new ArrayList<>();
        collection.add(nail1);
        collection.add(nail2);
        collection.add(nail3);
        collection.add(nail4);
        collection.add(nail5);
        collection.add(nail6);
        collection.add(nail7);
        collection.add(nail8);
        collection.add(nail9);
        collection.add(nail10);

        for (NailPolishDTO nail : collection) {
            nail.details();
            System.out.println("----------------");
        }
    }
}
