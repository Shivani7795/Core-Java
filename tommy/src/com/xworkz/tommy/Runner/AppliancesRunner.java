package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.AppliancesDTO;
import com.xworkz.tommy.dto.SareeDTO;
import com.xworkz.tommy.repository.AppliancesRepositoryImpl;
import com.xworkz.tommy.repository.SareeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesRepositoryImpl appliancesRepositoryimpl=new AppliancesRepositoryImpl();
        Collection<AppliancesDTO> collection=appliancesRepositoryimpl.findAllAppliances();
        appliancesRepositoryimpl.warranty(collection);
        appliancesRepositoryimpl.price(collection);

    }
}
