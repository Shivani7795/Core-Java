package com.xworkz.sweety.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
public class SweetDto {
    private String name;
    private double price;
    private String[] ingredients;
    private double quantity;
    private int pack;

    @Override
    public boolean equals(Object obj){
        System.out.println("equals in SweetDto");
        if(obj!=null){
            if(obj instanceof SweetDto){
                SweetDto casted=(SweetDto) obj;
                return this.ingredients.equals(casted.ingredients);
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        //System.out.println("running hashcode in SweetDto");
        int generateHash = Objects.hash(name,price);
       //System.out.println("generate hashcode by name:" + generateHash);
        return generateHash;
    }



}
