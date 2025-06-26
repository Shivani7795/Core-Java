package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.SareeDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AppliancesRepositoryImpl implements AppliancesRepository{
    public Collection<AppliancesDTO> findAllAppliances() {
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

        return collection;
    }
    public void warranty(Collection<AppliancesDTO>collection){
        System.out.println("for each loop");
        for(AppliancesDTO appliancesDTO:collection){
            if(appliancesDTO.getWarranty()==2){
                System.out.println("Appliances having 2 years warranty are:" + appliancesDTO.getName());
            }
        }
    }
    public void price(Collection<AppliancesDTO>collection){
        System.out.println("iterator in the loop");
        System.out.println("appliances below 20000 are:");
        Iterator<AppliancesDTO>price=collection.iterator();
        while(price.hasNext()){
            AppliancesDTO appliancesDTO=price.next();
            if(appliancesDTO.getPrice()<20000){
                System.out.println(appliancesDTO.getName());
            }
        }
    }
}

