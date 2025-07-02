package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.SareeDTO;
import com.xworkz.tommy.repository.SareeRepository;
import com.xworkz.tommy.repository.SareeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {
        SareeRepositoryImpl sareeRepositoryimpl=new SareeRepositoryImpl();
        Collection<SareeDTO> collection=sareeRepositoryimpl.findAllSaree();
        sareeRepositoryimpl.findAll(collection);
        sareeRepositoryimpl.findAllprice(collection);

        collection.stream().sorted().forEach(System.out::println);
    }
}
