package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.SareeDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRepositoryImpl implements SareeRepository {

    @Override
    public Collection<SareeDTO> findAllSaree() {

        SareeDTO saree1 = new SareeDTO("Marriage", "Green", 25000, "Silk");
        SareeDTO saree2 = new SareeDTO("Festival", "Red", 18000, "Cotton");
        SareeDTO saree3 = new SareeDTO("Casual", "Blue", 1200, "Synthetic");
        SareeDTO saree4 = new SareeDTO("Party", "Black", 3200, "Georgette");
        SareeDTO saree5 = new SareeDTO("Reception", "Gold", 28000, "Kanjivaram");
        SareeDTO saree6 = new SareeDTO("Traditional", "Black", 22000, "Banarasi");
        SareeDTO saree7 = new SareeDTO("Office Wear", "Grey", 1500, "Linen");
        SareeDTO saree8 = new SareeDTO("Temple Visit", "Black", 1900, "Cotton Silk");
        SareeDTO saree9 = new SareeDTO("Evening Wear", "Navy Blue", 3500, "Chiffon");
        SareeDTO saree10 = new SareeDTO("Haldi Ceremony", "Black", 2800, "Art Silk");

        Collection<SareeDTO> collection = new ArrayList<>();
        collection.add(saree1);
        collection.add(saree2);
        collection.add(saree3);
        collection.add(saree4);
        collection.add(saree5);
        collection.add(saree6);
        collection.add(saree7);
        collection.add(saree8);
        collection.add(saree9);
        collection.add(saree10);
        return collection;
    }

    public void findAll(Collection<SareeDTO> collection) {
        System.out.println("for each loop");
        for (SareeDTO sareeDTO : collection) {
            if (sareeDTO.getPrice() > 20000) {
                System.out.println("saree above price 20000 are:" + sareeDTO.getMaterial());
            }
        }
    }
    public void findAllprice(Collection<SareeDTO> collection){
        System.out.println("iterator in loop");
        System.out.println("saree with black color are:");
        Iterator<SareeDTO> price=collection.iterator();
        while(price.hasNext()){
            SareeDTO sareeDTO=price.next();
            if(sareeDTO.getColor().equalsIgnoreCase("black")){
                System.out.println(sareeDTO.getMaterial());
            }
        }
    }
}
