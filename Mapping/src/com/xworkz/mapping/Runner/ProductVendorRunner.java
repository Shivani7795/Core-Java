package com.xworkz.mapping.Runner;
import com.xworkz.mapping.dto.ProductDto;
import com.xworkz.mapping.dto.VendorDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductVendorRunner {
    public static void main(String[] args) {

        ProductDto productDto1 = new ProductDto("Notebook", "Stationery", 50, "N123", 301);
        ProductDto productDto2 = new ProductDto("Pen", "Stationery", 10, "P456", 302);
        ProductDto productDto3 = new ProductDto("Pencil", "Stationery", 5, "PC789", 303);
        ProductDto productDto4 = new ProductDto("Marker", "Stationery", 20, "M321", 304);
        ProductDto productDto5 = new ProductDto("Eraser", "Stationery", 3, "E654", 305);
        ProductDto productDto6 = new ProductDto("Stapler", "Stationery", 30, "ST987", 306);
        ProductDto productDto7 = new ProductDto("Scissors", "Stationery", 25, "SC741", 307);
        ProductDto productDto8 = new ProductDto("Glue", "Stationery", 15, "G852", 308);
        ProductDto productDto9 = new ProductDto("Tape", "Stationery", 12, "T963", 309);
        ProductDto productDto10 = new ProductDto("Highlighter", "Stationery", 18, "H147", 310);
        ProductDto productDto11 = new ProductDto("File", "Stationery", 40, "F258", 311);
        ProductDto productDto12 = new ProductDto("Folder", "Stationery", 35, "FD369", 312);
        ProductDto productDto13 = new ProductDto("Chart Paper", "Stationery", 7, "CP159", 313);
        ProductDto productDto14 = new ProductDto("Compass", "Stationery", 28, "CM753", 314);
        ProductDto productDto15 = new ProductDto("Protractor", "Stationery", 9, "PR963", 315);
        ProductDto productDto16 = new ProductDto("Ruler", "Stationery", 8, "R852", 316);
        ProductDto productDto17 = new ProductDto("Board Duster", "Stationery", 22, "BD741", 317);
        ProductDto productDto18 = new ProductDto("White Board", "Stationery", 200, "WB654", 318);
        ProductDto productDto19 = new ProductDto("Notice Board", "Stationery", 150, "NB321", 319);
        ProductDto productDto20 = new ProductDto("Chalk", "Stationery", 6, "CH987", 320);
        ProductDto productDto21 = new ProductDto("Clip", "Stationery", 4, "CL456", 321);
        ProductDto productDto22 = new ProductDto("Pin", "Stationery", 2, "PI741", 322);
        ProductDto productDto23 = new ProductDto("Binder", "Stationery", 60, "B963", 323);
        ProductDto productDto24 = new ProductDto("Sticky Notes", "Stationery", 13, "SN258", 324);
        ProductDto productDto25 = new ProductDto("Calendar", "Stationery", 45, "C369", 325);

        VendorDto vendorDto1 = new VendorDto("WriteWorld", "GST223", LocalDate.of(2019, 10, 24));
        VendorDto vendorDto2 = new VendorDto("NoteHub", "GST224", LocalDate.of(2018, 1, 10));
        VendorDto vendorDto3 = new VendorDto("PaperMart", "GST225", LocalDate.of(2017, 3, 9));
        VendorDto vendorDto4 = new VendorDto("StationeryLane", "GST226", LocalDate.of(2020, 2, 15));
        VendorDto vendorDto5 = new VendorDto("ToolsStation", "GST227", LocalDate.of(2021, 8, 11));
        VendorDto vendorDto6 = new VendorDto("EduMart", "GST228", LocalDate.of(2022, 5, 14));
        VendorDto vendorDto7 = new VendorDto("LearnCo", "GST229", LocalDate.of(2016, 9, 2));
        VendorDto vendorDto8 = new VendorDto("CraftPoint", "GST230", LocalDate.of(2014, 10, 10));
        VendorDto vendorDto9 = new VendorDto("SupplyLink", "GST231", LocalDate.of(2017, 12, 5));
        VendorDto vendorDto10 = new VendorDto("DailyUse", "GST232", LocalDate.of(2022, 6, 1));
        VendorDto vendorDto11 = new VendorDto("ClassEdge", "GST233", LocalDate.of(2018, 4, 18));
        VendorDto vendorDto12 = new VendorDto("NotebookPro", "GST234", LocalDate.of(2019, 8, 27));
        VendorDto vendorDto13 = new VendorDto("EduKit", "GST235", LocalDate.of(2016, 10, 19));
        VendorDto vendorDto14 = new VendorDto("OfficeBazaar", "GST236", LocalDate.of(2020, 5, 11));
        VendorDto vendorDto15 = new VendorDto("NoteStack", "GST237", LocalDate.of(2021, 3, 3));
        VendorDto vendorDto16 = new VendorDto("NoteXpress", "GST238", LocalDate.of(2015, 7, 22));
        VendorDto vendorDto17 = new VendorDto("PaperPack", "GST239", LocalDate.of(2018, 11, 13));
        VendorDto vendorDto18 = new VendorDto("BookCentre", "GST240", LocalDate.of(2016, 6, 8));
        VendorDto vendorDto19 = new VendorDto("EduHouse", "GST241", LocalDate.of(2019, 2, 25));
        VendorDto vendorDto20 = new VendorDto("SmartClass", "GST242", LocalDate.of(2017, 9, 17));
        VendorDto vendorDto21 = new VendorDto("BoardWorks", "GST243", LocalDate.of(2014, 10, 6));
        VendorDto vendorDto22 = new VendorDto("OfficeLine", "GST244", LocalDate.of(2015, 12, 28));
        VendorDto vendorDto23 = new VendorDto("SuppliesNow", "GST245", LocalDate.of(2020, 1, 9));
        VendorDto vendorDto24 = new VendorDto("DailyTools", "GST246", LocalDate.of(2021, 8, 5));
        VendorDto vendorDto25 = new VendorDto("EliteNotes", "GST247", LocalDate.of(2022, 4, 20));

        Map<ProductDto,VendorDto> map=new HashMap<>();

        map.put(productDto1,vendorDto1);
        map.put(productDto2,vendorDto2);
        map.put(productDto3,vendorDto3);
        map.put(productDto4,vendorDto4);
        map.put(productDto5,vendorDto5);
        map.put(productDto6,vendorDto6);
        map.put(productDto7,vendorDto7);
        map.put(productDto8,vendorDto8);
        map.put(productDto9,vendorDto9);
        map.put(productDto10,vendorDto10);
        map.put(productDto11,vendorDto11);
        map.put(productDto12,vendorDto12);
        map.put(productDto13,vendorDto13);
        map.put(productDto14,vendorDto14);
        map.put(productDto15,vendorDto15);
        map.put(productDto16,vendorDto16);
        map.put(productDto17,vendorDto17);
        map.put(productDto18,vendorDto18);
        map.put(productDto19,vendorDto19);
        map.put(productDto20,vendorDto20);
        map.put(productDto21,vendorDto21);
        map.put(productDto22,vendorDto22);
        map.put(productDto23,vendorDto23);
        map.put(productDto24,vendorDto24);
        map.put(productDto25,vendorDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);
        System.out.println("Values");
        map.values().forEach(System.out::println);

        System.out.println("Entries");
        Set<Map.Entry<ProductDto,VendorDto>> entrySet=map.entrySet();
        entrySet.forEach(e->{
            ProductDto productDto=e.getKey();
            VendorDto vendorDto=e.getValue();
            System.out.println(productDto);
            System.out.println(vendorDto);
        });
    }
}
