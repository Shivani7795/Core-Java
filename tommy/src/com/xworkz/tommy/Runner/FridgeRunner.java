package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.FridgeDTO;
import com.xworkz.tommy.repository.AppliancesRepositoryImpl;
import com.xworkz.tommy.repository.FridgeRepository;
import com.xworkz.tommy.repository.FridgeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {
    public static void main(String[] args) {
        FridgeRepositoryImpl fridgeRepositoryimpl = new FridgeRepositoryImpl();
        Collection<FridgeDTO> collection = fridgeRepositoryimpl.findAllFridge();
        fridgeRepositoryimpl.brand(collection);
        fridgeRepositoryimpl.price(collection);


    }
}