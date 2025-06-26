package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.FridgeDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FridgeRepositoryImpl implements FridgeRepository {
    @Override
    public Collection<FridgeDTO> findAllFridge() {
            FridgeDTO fridgeDTO1 = new FridgeDTO("LG", "top freezer", 10000);
            FridgeDTO fridgeDTO2 = new FridgeDTO("Samsung", "bottom freezer", 15000);
            FridgeDTO fridgeDTO3 = new FridgeDTO("haier", "single Door", 20000);
            FridgeDTO fridgeDTO4 = new FridgeDTO("Whirpool", "double Door", 25000);
            FridgeDTO fridgeDTO5 = new FridgeDTO("LG", "side by side", 30000);

            Collection<FridgeDTO> collection = new ArrayList<>();
            collection.add(fridgeDTO1);
            collection.add(fridgeDTO2);
            collection.add(fridgeDTO3);
            collection.add(fridgeDTO4);
            collection.add(fridgeDTO5);

            return collection;
        }

        public void brand(Collection<FridgeDTO>collection){
        System.out.println("for each loop");
        for(FridgeDTO fridgeDTO:collection){
            if(fridgeDTO.getBrand().equalsIgnoreCase("LG")){
                System.out.println("frige of Brand LG are:"+fridgeDTO.getType());
            }
        }
    }
    public void price(Collection<FridgeDTO>collection){
        System.out.println("iterator in loop");
        System.out.println("fridge above 20000 are:");
        Iterator<FridgeDTO> price= collection.iterator();
        while (price.hasNext()){
            FridgeDTO fridgeDTO=price.next();
            if(fridgeDTO.getPrice()>20000){
                System.out.println(fridgeDTO.getType());
            }
        }
    }
}
