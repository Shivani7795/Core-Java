package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.HouseDto;
import com.xworkz.eagle.dto.SecurityDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HouseRepositoryImpl implements HouseRepository {

    private final Set<HouseDto> houseSet = new HashSet<>();

    public HouseRepositoryImpl(SecurityRepository securityRepository) {
        Iterator<SecurityDto> iterator = securityRepository.findSecurity().iterator();

        houseSet.add(new HouseDto("1st Main, Bangalore", 101, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("MG Road, Bangalore", 102, "Villa", iterator.next()));
        houseSet.add(new HouseDto("BTM Layout, Bangalore", 103, "Independent", iterator.next()));
        houseSet.add(new HouseDto("Koramangala, Bangalore", 104, "Penthouse", iterator.next()));
        houseSet.add(new HouseDto("Indiranagar, Bangalore", 105, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Jayanagar, Bangalore", 106, "Villa", iterator.next()));
        houseSet.add(new HouseDto("Whitefield, Bangalore", 107, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Electronic City, Bangalore", 108, "Independent", iterator.next()));
        houseSet.add(new HouseDto("Rajajinagar, Bangalore", 109, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Hebbal, Bangalore", 110, "Duplex", iterator.next()));

        houseSet.add(new HouseDto("Marathahalli, Bangalore", 111, "Penthouse", iterator.next()));
        houseSet.add(new HouseDto("Yelahanka, Bangalore", 112, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Banashankari, Bangalore", 113, "Villa", iterator.next()));
        houseSet.add(new HouseDto("Hosur Road, Bangalore", 114, "Independent", iterator.next()));
        houseSet.add(new HouseDto("Sarjapur Road, Bangalore", 115, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Kengeri, Bangalore", 116, "Villa", iterator.next()));
        houseSet.add(new HouseDto("Bellandur, Bangalore", 117, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Malleswaram, Bangalore", 118, "Independent", iterator.next()));
        houseSet.add(new HouseDto("RT Nagar, Bangalore", 119, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Vijayanagar, Bangalore", 120, "Duplex", iterator.next()));

        houseSet.add(new HouseDto("JP Nagar, Bangalore", 121, "Villa", iterator.next()));
        houseSet.add(new HouseDto("Kumaraswamy Layout, Bangalore", 122, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Basavanagudi, Bangalore", 123, "Independent", iterator.next()));
        houseSet.add(new HouseDto("Wilson Garden, Bangalore", 124, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Domlur, Bangalore", 125, "Penthouse", iterator.next()));
        houseSet.add(new HouseDto("KR Puram, Bangalore", 126, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Ulsoor, Bangalore", 127, "Villa", iterator.next()));
        houseSet.add(new HouseDto("Sanjay Nagar, Bangalore", 128, "Independent", iterator.next()));
        houseSet.add(new HouseDto("Frazer Town, Bangalore", 129, "Apartment", iterator.next()));
        houseSet.add(new HouseDto("Richmond Town, Bangalore", 130, "Duplex", iterator.next()));
    }

    @Override
    public Set<HouseDto> findHouse() {
        return houseSet;
    }
}
