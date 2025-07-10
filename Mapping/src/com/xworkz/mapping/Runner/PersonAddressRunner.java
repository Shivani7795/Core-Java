package com.xworkz.mapping.Runner;
import com.xworkz.mapping.dto.AddressDto;
import com.xworkz.mapping.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonAddressRunner {
    public static void main(String[] args) {

        Map<PersonDto, AddressDto> map = new HashMap<>();

        PersonDto personDto1 = new PersonDto("Kiran", "kiran12@gmail.com", "8213 1234 5678");
        PersonDto personDto2 = new PersonDto("Bhavna", "bhavna.sharma@yahoo.com", "9123 4567 8910");
        PersonDto personDto3 = new PersonDto("Siddharth", "sid.k@outlook.com", "7890 8765 4321");
        PersonDto personDto4 = new PersonDto("Lakshmi", "lakshmi.r@gmail.com", "1234 5678 9012");
        PersonDto personDto5 = new PersonDto("Yash", "yash.t@gmail.com", "5678 9012 3456");
        PersonDto personDto6 = new PersonDto("Gauri", "gauri_b@gmail.com", "6789 0123 4567");
        PersonDto personDto7 = new PersonDto("Harish", "harish.n@gmail.com", "2345 6789 0123");
        PersonDto personDto8 = new PersonDto("Smita", "smita.v@yahoo.com", "3456 7890 1234");
        PersonDto personDto9 = new PersonDto("Naveen", "naveen.k@hotmail.com", "4567 8901 2345");
        PersonDto personDto10 = new PersonDto("Radha", "radha.singh@gmail.com", "5678 9012 3456");
        PersonDto personDto11 = new PersonDto("Kishore", "kishore.p@gmail.com", "6789 1234 5678");
        PersonDto personDto12 = new PersonDto("Isha", "isha.t@rediffmail.com", "7890 2345 6789");
        PersonDto personDto13 = new PersonDto("Arjun", "arjun.m@gmail.com", "8901 3456 7890");
        PersonDto personDto14 = new PersonDto("Manisha", "manisha.k@outlook.com", "9012 4567 8901");
        PersonDto personDto15 = new PersonDto("Dev", "dev123@gmail.com", "1234 5678 9012");
        PersonDto personDto16 = new PersonDto("Snehal", "snehal.r@gmail.com", "2345 6789 0123");
        PersonDto personDto17 = new PersonDto("Vishal", "vishal.k@gmail.com", "3456 7890 1234");
        PersonDto personDto18 = new PersonDto("Neelam", "neelam.b@gmail.com", "4567 8901 2345");
        PersonDto personDto19 = new PersonDto("Tanmay", "tanmay.t@yahoo.com", "5678 9012 3456");
        PersonDto personDto20 = new PersonDto("Sheetal", "sheetal.p@hotmail.com", "6789 0123 4567");
        PersonDto personDto21 = new PersonDto("Jay", "jay.kumar@gmail.com", "7890 1234 5678");
        PersonDto personDto22 = new PersonDto("Rina", "rina.b@gmail.com", "8901 2345 6789");
        PersonDto personDto23 = new PersonDto("Om", "om.t@gmail.com", "9012 3456 7890");
        PersonDto personDto24 = new PersonDto("Bhavya", "bhavya.singh@gmail.com", "1234 5678 9012");
        PersonDto personDto25 = new PersonDto("Tara", "tara.k@outlook.com", "2345 6789 0123");

        AddressDto addressDto1 = new AddressDto(11, "Green Park", "Delhi", 110016);
        AddressDto addressDto2 = new AddressDto(22, "Sector 21", "Chandigarh", 160022);
        AddressDto addressDto3 = new AddressDto(33, "Gariahat", "Kolkata", 700019);
        AddressDto addressDto4 = new AddressDto(44, "Marathahalli", "Bangalore", 560037);
        AddressDto addressDto5 = new AddressDto(55, "Velachery", "Chennai", 600042);
        AddressDto addressDto6 = new AddressDto(66, "Hinjewadi", "Pune", 411057);
        AddressDto addressDto7 = new AddressDto(77, "Alambagh", "Lucknow", 226005);
        AddressDto addressDto8 = new AddressDto(88, "Kukatpally", "Hyderabad", 500072);
        AddressDto addressDto9 = new AddressDto(99, "Boring Canal Road", "Patna", 800001);
        AddressDto addressDto10 = new AddressDto(100, "Ashok Nagar", "Ranchi", 834002);
        AddressDto addressDto11 = new AddressDto(111, "Sector 62", "Noida", 201309);
        AddressDto addressDto12 = new AddressDto(121, "Dumdum", "Kolkata", 700028);
        AddressDto addressDto13 = new AddressDto(131, "MG Road", "Indore", 452001);
        AddressDto addressDto14 = new AddressDto(141, "Kalyani Nagar", "Pune", 411006);
        AddressDto addressDto15 = new AddressDto(151, "Lajpat Nagar", "Delhi", 110024);
        AddressDto addressDto16 = new AddressDto(161, "Baner", "Pune", 411045);
        AddressDto addressDto17 = new AddressDto(171, "Anna Nagar", "Chennai", 600040);
        AddressDto addressDto18 = new AddressDto(181, "Rajajinagar", "Bangalore", 560010);
        AddressDto addressDto19 = new AddressDto(191, "Sector 14", "Gurgaon", 122001);
        AddressDto addressDto20 = new AddressDto(201, "Shyambazar", "Kolkata", 700004);
        AddressDto addressDto21 = new AddressDto(211, "BTM Layout", "Bangalore", 560076);
        AddressDto addressDto22 = new AddressDto(221, "Indira Nagar", "Bangalore", 560038);
        AddressDto addressDto23 = new AddressDto(231, "Kharghar", "Mumbai", 410210);
        AddressDto addressDto24 = new AddressDto(241, "Juhu", "Mumbai", 400049);
        AddressDto addressDto25 = new AddressDto(251, "Sion", "Mumbai", 400022);

        map.put(personDto1, addressDto1);
        map.put(personDto2, addressDto2);
        map.put(personDto3, addressDto3);
        map.put(personDto4, addressDto4);
        map.put(personDto5, addressDto5);
        map.put(personDto6, addressDto6);
        map.put(personDto7, addressDto7);
        map.put(personDto8, addressDto8);
        map.put(personDto9, addressDto9);
        map.put(personDto10, addressDto10);
        map.put(personDto11, addressDto11);
        map.put(personDto12, addressDto12);
        map.put(personDto13, addressDto13);
        map.put(personDto14, addressDto14);
        map.put(personDto15, addressDto15);
        map.put(personDto16, addressDto16);
        map.put(personDto17, addressDto17);
        map.put(personDto18, addressDto18);
        map.put(personDto19, addressDto19);
        map.put(personDto20, addressDto20);
        map.put(personDto21, addressDto21);
        map.put(personDto22, addressDto22);
        map.put(personDto23, addressDto23);
        map.put(personDto24, addressDto24);
        map.put(personDto25, addressDto25);

        map.keySet().forEach(e -> System.out.println("PersonDetails: " + e));
        map.values().forEach(e -> System.out.println("Address: " + e));

        System.out.println("Entries");
        Set<Map.Entry<PersonDto, AddressDto>> entrySet = map.entrySet();
        entrySet.forEach(e -> {
            PersonDto personDto = e.getKey();
            AddressDto addressDto = e.getValue();
            System.out.println(personDto);
            System.out.println(addressDto);
        });
    }
}
