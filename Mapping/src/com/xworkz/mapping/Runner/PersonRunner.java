package com.xworkz.mapping.Runner;

import com.xworkz.mapping.dto.AddressDto;
import com.xworkz.mapping.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {

        Map<PersonDto, AddressDto> map = new HashMap<>();

        PersonDto personDto1 = new PersonDto("aditi", "aditi@gmail.com", "4745 8923 9264");
        AddressDto addressDto1 = new AddressDto(89, "hubli", "dharwad", 654547);
        map.put(personDto1, addressDto1);

        map.keySet().forEach(e -> System.out.println("PersonDetails: " + e));
        map.values().forEach(e -> System.out.println("Address: " + e));
    }
}
