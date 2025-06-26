package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.CampingAccessoryDTO;
import com.xworkz.tommy.repository.AppliancesRepositoryImpl;
import com.xworkz.tommy.repository.CampingAccessoryRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessoryRepositoryImpl campingAccessoryRepositoryimpl=new CampingAccessoryRepositoryImpl();
        Collection<CampingAccessoryDTO>collection=campingAccessoryRepositoryimpl.findAllAccessory();
        campingAccessoryRepositoryimpl.findBelowWeight(collection);
        campingAccessoryRepositoryimpl.findCooking(collection);
    }
}
