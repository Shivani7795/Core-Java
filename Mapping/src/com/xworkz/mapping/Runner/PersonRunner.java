package com.xworkz.mapping.Runner;

import com.xworkz.mapping.dto.AddressDto;
import com.xworkz.mapping.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {
        Map<PersonDto, AddressDto> map = new HashMap<>();

        PersonDto personDto1 = new PersonDto("Aditi", "aditi@gmail.com", "4745 8923 9264");
        PersonDto personDto2 = new PersonDto("Bhavesh", "bhavesh123@yahoo.com", "3847 1111 2222");
        PersonDto personDto3 = new PersonDto("Charan", "charan.kumar@gmail.com", "1923 3333 4444");
        PersonDto personDto4 = new PersonDto("Deepa", "deepa.d@gmail.com", "2846 5555 6666");
        PersonDto personDto5 = new PersonDto("Eshan", "eshan@outlook.com", "9384 7777 8888");
        PersonDto personDto6 = new PersonDto("Farah", "farah.z@gmail.com", "5643 9999 0000");
        PersonDto personDto7 = new PersonDto("Gopal", "gopal.r@yahoo.in", "1245 1234 5678");
        PersonDto personDto8 = new PersonDto("Harini", "harini.s@protonmail.com", "8123 2345 6789");
        PersonDto personDto9 = new PersonDto("Imran", "imran.khan@gmail.com", "9001 3456 7890");
        PersonDto personDto10 = new PersonDto("Juhi", "juhi.j@yahoo.com", "1100 4567 8901");
        PersonDto personDto11 = new PersonDto("Kunal", "kunal12@gmail.com", "2200 5678 9012");
        PersonDto personDto12 = new PersonDto("Lavanya", "lavanya.r@rediffmail.com", "3300 6789 0123");
        PersonDto personDto13 = new PersonDto("Manav", "manav@live.com", "4400 7890 1234");
        PersonDto personDto14 = new PersonDto("Nidhi", "nidhi.g@aol.com", "5500 8901 2345");
        PersonDto personDto15 = new PersonDto("Omkar", "omkar.b@hotmail.com", "6600 9012 3456");
        PersonDto personDto16 = new PersonDto("Priti", "priti.v@gmail.com", "7700 0123 4567");
        PersonDto personDto17 = new PersonDto("Qadir", "qadir.a@gmail.com", "8800 1234 5678");
        PersonDto personDto18 = new PersonDto("Riya", "riya.m@gmail.com", "9900 2345 6789");
        PersonDto personDto19 = new PersonDto("Sohan", "sohan.s@yahoo.com", "1010 3456 7890");
        PersonDto personDto20 = new PersonDto("Tanvi", "tanvi.k@outlook.com", "2020 4567 8901");
        PersonDto personDto21 = new PersonDto("Uday", "uday.t@gmail.com", "3030 5678 9012");
        PersonDto personDto22 = new PersonDto("Varsha", "varsha.p@gmail.com", "4040 6789 0123");
        PersonDto personDto23 = new PersonDto("Wasim", "wasim.m@gmail.com", "5050 7890 1234");
        PersonDto personDto24 = new PersonDto("Xenia", "xenia.l@gmail.com", "6060 8901 2345");
        PersonDto personDto25 = new PersonDto("Yusuf", "yusuf.n@gmail.com", "7070 9012 3456");

        AddressDto addressDto1 = new AddressDto(10, "Hubli", "Dharwad", 654547);
        AddressDto addressDto2 = new AddressDto(11, "Jayanagar", "Bangalore", 560070);
        AddressDto addressDto3 = new AddressDto(12, "Lalbagh", "Mysore", 570010);
        AddressDto addressDto4 = new AddressDto(13, "MG Road", "Mangalore", 575001);
        AddressDto addressDto5 = new AddressDto(14, "Race Course", "Coimbatore", 641018);
        AddressDto addressDto6 = new AddressDto(15, "Park Street", "Kolkata", 700016);
        AddressDto addressDto7 = new AddressDto(16, "Banjara Hills", "Hyderabad", 500034);
        AddressDto addressDto8 = new AddressDto(17, "Velachery", "Chennai", 600042);
        AddressDto addressDto9 = new AddressDto(18, "Sector 62", "Noida", 201301);
        AddressDto addressDto10 = new AddressDto(19, "Connaught Place", "Delhi", 110001);
        AddressDto addressDto11 = new AddressDto(20, "Sector 17", "Chandigarh", 160017);
        AddressDto addressDto12 = new AddressDto(21, "Ashok Nagar", "Jaipur", 302001);
        AddressDto addressDto13 = new AddressDto(22, "Navrangpura", "Ahmedabad", 380009);
        AddressDto addressDto14 = new AddressDto(23, "Gandhibagh", "Nagpur", 440002);
        AddressDto addressDto15 = new AddressDto(24, "Patliputra", "Patna", 800013);
        AddressDto addressDto16 = new AddressDto(25, "Boring Road", "Patna", 800001);
        AddressDto addressDto17 = new AddressDto(26, "Aliganj", "Lucknow", 226024);
        AddressDto addressDto18 = new AddressDto(27, "Rajendra Nagar", "Indore", 452012);
        AddressDto addressDto19 = new AddressDto(28, "Laxmi Nagar", "Delhi", 110092);
        AddressDto addressDto20 = new AddressDto(29, "Gopalapuram", "Chennai", 600086);
        AddressDto addressDto21 = new AddressDto(30, "Shivaji Nagar", "Pune", 411005);
        AddressDto addressDto22 = new AddressDto(31, "Gariahat", "Kolkata", 700019);
        AddressDto addressDto23 = new AddressDto(32, "Civil Lines", "Allahabad", 211001);
        AddressDto addressDto24 = new AddressDto(33, "Taltala", "Kolkata", 700014);
        AddressDto addressDto25 = new AddressDto(34, "MVP Colony", "Vizag", 530017);

// Put into map
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
    }
}
