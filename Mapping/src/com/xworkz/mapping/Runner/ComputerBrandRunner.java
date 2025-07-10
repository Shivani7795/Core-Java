package com.xworkz.mapping.Runner;
import com.xworkz.mapping.dto.BrandDto;
import com.xworkz.mapping.dto.ComputerDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComputerBrandRunner {
    public static void main(String[] args) {

        ComputerDto computerDto1 = new ComputerDto(201, "M1", 8, true);
        ComputerDto computerDto2 = new ComputerDto(202, "Snapdragon", 4, false);
        ComputerDto computerDto3 = new ComputerDto(203, "Xeon", 32, true);
        ComputerDto computerDto4 = new ComputerDto(204, "Athlon", 4, false);
        ComputerDto computerDto5 = new ComputerDto(205, "Celeron", 8, false);
        ComputerDto computerDto6 = new ComputerDto(206, "Pentium", 16, false);
        ComputerDto computerDto7 = new ComputerDto(207, "M2", 16, true);
        ComputerDto computerDto8 = new ComputerDto(208, "Core Ultra", 64, true);
        ComputerDto computerDto9 = new ComputerDto(209, "Threadripper", 128, true);
        ComputerDto computerDto10 = new ComputerDto(210, "Epyc", 256, true);
        ComputerDto computerDto11 = new ComputerDto(211, "A-Series", 4, false);
        ComputerDto computerDto12 = new ComputerDto(212, "G-Series", 6, false);
        ComputerDto computerDto13 = new ComputerDto(213, "FX", 8, true);
        ComputerDto computerDto14 = new ComputerDto(214, "Z-Series", 64, true);
        ComputerDto computerDto15 = new ComputerDto(215, "X-Series", 128, true);
        ComputerDto computerDto16 = new ComputerDto(216, "N-Series", 16, false);
        ComputerDto computerDto17 = new ComputerDto(217, "K-Series", 32, true);
        ComputerDto computerDto18 = new ComputerDto(218, "H-Series", 12, true);
        ComputerDto computerDto19 = new ComputerDto(219, "B-Series", 24, true);
        ComputerDto computerDto20 = new ComputerDto(220, "U-Series", 20, false);
        ComputerDto computerDto21 = new ComputerDto(221, "V-Series", 40, true);
        ComputerDto computerDto22 = new ComputerDto(222, "Y-Series", 10, false);
        ComputerDto computerDto23 = new ComputerDto(223, "A9", 6, false);
        ComputerDto computerDto24 = new ComputerDto(224, "i1", 2, false);
        ComputerDto computerDto25 = new ComputerDto(225, "Z3", 32, true);


        BrandDto brandDto1 = new BrandDto("Realme", "India", "Madhav", 2018);
        BrandDto brandDto2 = new BrandDto("Nothing", "UK", "Carl", 2020);
        BrandDto brandDto3 = new BrandDto("Infinix", "Hong Kong", "Benjamin", 2013);
        BrandDto brandDto4 = new BrandDto("Lava", "India", "Hari", 2009);
        BrandDto brandDto5 = new BrandDto("Micromax", "India", "Rahul", 2000);
        BrandDto brandDto6 = new BrandDto("Blu", "USA", "Samuel", 2009);
        BrandDto brandDto7 = new BrandDto("Tecno", "China", "George", 2006);
        BrandDto brandDto8 = new BrandDto("Intex", "India", "Narendra", 1996);
        BrandDto brandDto9 = new BrandDto("Karbonn", "India", "Pardeep", 2009);
        BrandDto brandDto10 = new BrandDto("Spice", "India", "Dilip", 2000);
        BrandDto brandDto11 = new BrandDto("Videocon", "India", "Venugopal", 1985);
        BrandDto brandDto12 = new BrandDto("Xolo", "India", "Sunil", 2012);
        BrandDto brandDto13 = new BrandDto("Celkon", "India", "Murali", 2009);
        BrandDto brandDto14 = new BrandDto("iVOOMi", "China", "Ashwin", 2001);
        BrandDto brandDto15 = new BrandDto("Zen", "India", "Deepak", 2009);
        BrandDto brandDto16 = new BrandDto("Maxx", "India", "Ajay", 2004);
        BrandDto brandDto17 = new BrandDto("I-Ball", "India", "Anil", 2001);
        BrandDto brandDto18 = new BrandDto("Onida", "India", "Gulu", 1981);
        BrandDto brandDto19 = new BrandDto("Haier", "China", "Zhang", 1984);
        BrandDto brandDto20 = new BrandDto("Motorola", "USA", "Paul", 1928);
        BrandDto brandDto21 = new BrandDto("HTC", "Taiwan", "Cher", 1997);
        BrandDto brandDto22 = new BrandDto("Meizu", "China", "Jack", 2003);
        BrandDto brandDto23 = new BrandDto("Coolpad", "China", "Guo", 1993);
        BrandDto brandDto24 = new BrandDto("LeEco", "China", "Jia", 2004);
        BrandDto brandDto25 = new BrandDto("BQ", "Spain", "Rodrigo", 2010);

        Map<ComputerDto,BrandDto> map = new HashMap<>();

        map.put(computerDto1, brandDto1);
        map.put(computerDto2, brandDto2);
        map.put(computerDto3, brandDto3);
        map.put(computerDto4, brandDto4);
        map.put(computerDto5, brandDto5);
        map.put(computerDto6, brandDto6);
        map.put(computerDto7, brandDto7);
        map.put(computerDto8, brandDto8);
        map.put(computerDto9, brandDto9);
        map.put(computerDto10, brandDto10);
        map.put(computerDto11, brandDto11);
        map.put(computerDto12, brandDto12);
        map.put(computerDto13, brandDto13);
        map.put(computerDto14, brandDto14);
        map.put(computerDto15, brandDto15);
        map.put(computerDto16, brandDto16);
        map.put(computerDto17, brandDto17);
        map.put(computerDto18, brandDto18);
        map.put(computerDto19, brandDto19);
        map.put(computerDto20, brandDto20);
        map.put(computerDto21, brandDto21);
        map.put(computerDto22, brandDto22);
        map.put(computerDto23, brandDto23);
        map.put(computerDto24, brandDto24);
        map.put(computerDto25, brandDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);

        System.out.println("Entries");
        Set<Map.Entry<ComputerDto, BrandDto>> entrySet = map.entrySet();
        entrySet.forEach(e -> {
            ComputerDto computerDto = e.getKey();
            BrandDto brandDto = e.getValue();
            System.out.println(computerDto);
            System.out.println(brandDto);
        });
    }
}
