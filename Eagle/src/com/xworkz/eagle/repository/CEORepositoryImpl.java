package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CEODto;
import com.xworkz.eagle.dto.HouseDto;

import java.util.*;

public class CEORepositoryImpl implements CEORepository{
   private final Set<CEODto> cEODto = new HashSet<>();
    public CEORepositoryImpl(HouseRepository houseRepository){
        Iterator<HouseDto> iterator = houseRepository.findHouse().iterator();

            cEODto.add(new CEODto("Arun Kumar", 52, "MBA", iterator.next()));
            cEODto.add(new CEODto("Meena Rani", 49, "B.Tech", iterator.next()));
            cEODto.add(new CEODto("Sundar Raj", 55, "M.Tech",iterator.next()));
            cEODto.add(new CEODto("Kavitha", 47, "MBA", iterator.next()));
            cEODto.add(new CEODto("Murugan", 53, "PhD",iterator.next()));
            cEODto.add(new CEODto("Lakshmi", 50, "B.Com", iterator.next()));
            cEODto.add(new CEODto("Vignesh", 56, "MBA",iterator.next()));
            cEODto.add(new CEODto("Revathi", 45, "M.Sc", iterator.next()));
            cEODto.add(new CEODto("Ramesh", 51, "BBA",iterator.next()));
            cEODto.add(new CEODto("Anjali", 48, "MBA", iterator.next()));

            cEODto.add(new CEODto("Natarajan", 54, "M.Com", iterator.next()));
            cEODto.add(new CEODto("Sujatha", 46, "BCA", iterator.next()));
            cEODto.add(new CEODto("Saravanan", 50, "B.Sc",iterator.next()));
            cEODto.add(new CEODto("Priya", 49, "MBA", iterator.next()));
            cEODto.add(new CEODto("Karthik", 53, "M.Tech",iterator.next()));
            cEODto.add(new CEODto("Geetha", 47, "M.Sc", iterator.next()));
            cEODto.add(new CEODto("Ravi", 55, "BBA", iterator.next()));
            cEODto.add(new CEODto("Shanthi", 44, "MBA", iterator.next()));
            cEODto.add(new CEODto("Muthu", 52, "MCA", iterator.next()));
            cEODto.add(new CEODto("Janani", 48, "M.Com",iterator.next()));

            cEODto.add(new CEODto("Hariharan", 51, "MBA", iterator.next()));
            cEODto.add(new CEODto("Kausalya", 46, "B.Tech", iterator.next()));
            cEODto.add(new CEODto("Periyasamy", 54, "PhD",iterator.next()));
            cEODto.add(new CEODto("Deepa", 49, "B.Com", iterator.next()));
            cEODto.add(new CEODto("Bala", 50, "MBA", iterator.next()));
            cEODto.add(new CEODto("Uma", 47, "M.Sc", iterator.next()));
            cEODto.add(new CEODto("Thirumalai", 53, "MCA",iterator.next()));
            cEODto.add(new CEODto("Sindhu", 45, "MBA",iterator.next()));
            cEODto.add(new CEODto("Manikandan", 52, "B.Sc",iterator.next()));
            cEODto.add(new CEODto("Rajalakshmi", 48, "MBA",iterator.next()));
    }
    @Override
    public Set<CEODto> findCEO() {
        return cEODto;
    }
}

