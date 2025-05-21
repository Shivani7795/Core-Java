package com.xworkz.barbie.service;

import com.xworkz.barbie.dto.ProductDto;

public class ProductImplementation implements ProductService {
    public boolean save(ProductDto productDto) {
        String name = productDto.getName();
        if (name != null&& name.length()>2&& name.length()<20) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        String type = productDto.getType();
        if (type != null) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        String brand = productDto.getBrand();
        if (brand != null&& brand.length()>2&& brand.length()<20) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        String color = productDto.getColor();
        if (color != null&& color.length()>2&& color.length()<20) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        return true;
    }
}
