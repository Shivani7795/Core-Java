package com.xworkz.barbie.repository;

import com.xworkz.barbie.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
