package com.xworkz.barbie.dto;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String type;
    private String incomingPrice;
    private String sellingPrice;
    private String mrp;
    private String description;
    private String brand;
    private String quantity;
    private String color;
    private String weight;
    private String manufDate;
    private String warranty;
    private boolean returnPolicy;


}


