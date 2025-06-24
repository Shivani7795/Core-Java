package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.AppliancesDTO;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {

        AppliancesDTO appliance1 = new AppliancesDTO("Refrigerator", "LG", 28000, 2, "Silver");
        AppliancesDTO appliance2 = new AppliancesDTO("Microwave", "Samsung", 15000, 1, "Black");
        AppliancesDTO appliance3 = new AppliancesDTO("Washing Machine", "Whirlpool", 32000, 3, "White");
        AppliancesDTO appliance4 = new AppliancesDTO("Air Fryer", "Philips", 9500, 2, "Black");
        AppliancesDTO appliance5 = new AppliancesDTO("TV", "Panasonic", 45000, 4, "Grey");
        AppliancesDTO appliance6 = new AppliancesDTO("Dishwasher", "Bosch", 39000, 2, "White");
        AppliancesDTO appliance7 = new AppliancesDTO("Vacuum Cleaner", "Dyson", 25000, 2, "Red");
        AppliancesDTO appliance8 = new AppliancesDTO("AC", "Voltas", 42000, 3, "White");
        AppliancesDTO appliance9 = new AppliancesDTO("Mixer Grinder", "Prestige", 3500, 1, "Black");
        AppliancesDTO appliance10 = new AppliancesDTO("Oven", "Morphy Richards", 11000, 2, "Silver");

        Collection<AppliancesDTO> collection = new ArrayList<>();
        collection.add(appliance1);
        collection.add(appliance2);
        collection.add(appliance3);
        collection.add(appliance4);
        collection.add(appliance5);
        collection.add(appliance6);
        collection.add(appliance7);
        collection.add(appliance8);
        collection.add(appliance9);
        collection.add(appliance10);

        for (AppliancesDTO appliance : collection) {
            appliance.details();
            System.out.println("----------------");
        }
    }
}
