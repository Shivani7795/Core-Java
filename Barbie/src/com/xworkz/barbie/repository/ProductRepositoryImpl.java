package com.xworkz.barbie.repository;

import com.xworkz.barbie.dto.ProductDto;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("running in persisting productImplimentation");
        return true;
    }
}
