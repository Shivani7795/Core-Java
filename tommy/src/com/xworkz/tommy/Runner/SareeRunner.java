package com.xworkz.tommy.Runner;

import com.xworkz.tommy.dto.SareeDTO;

import java.util.ArrayList;
import java.util.List;

public class SareeRunner {
    public static void main(String[] args) {
        SareeDTO sareeDTO=new SareeDTO();
        SareeDTO saree1 = new SareeDTO("Marriage", "Green", 25000, "Silk");
        SareeDTO saree2 = new SareeDTO("Festival", "Red", 18000, "Cotton");
        SareeDTO saree3 = new SareeDTO("Casual", "Blue", 1200, "Synthetic");
        SareeDTO saree4 = new SareeDTO("Party", "Black", 3200, "Georgette");
        SareeDTO saree5 = new SareeDTO("Reception", "Gold", 28000, "Kanjivaram");

        List<SareeDTO> sareeList = new ArrayList<>();
        sareeList.add(saree1);
        sareeList.add(saree2);
        sareeList.add(saree3);
        sareeList.add(saree4);
        sareeList.add(saree5);

        for (SareeDTO saree : sareeList) {
            saree.details();
            System.out.println("----------------");
        }
    }
}