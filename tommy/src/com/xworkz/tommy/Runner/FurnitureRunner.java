package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.FurnitureDTO;
import com.xworkz.tommy.repository.FurnitureRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureRepositoryImpl furnitureRepositoryImpl=new FurnitureRepositoryImpl();
        Collection<FurnitureDTO>collection=furnitureRepositoryImpl.findAllFurniture();
        furnitureRepositoryImpl.warranty(collection);
        furnitureRepositoryImpl.type(collection);
    }
}
