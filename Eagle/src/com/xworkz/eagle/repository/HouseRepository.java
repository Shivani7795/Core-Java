package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CEODto;
import com.xworkz.eagle.dto.HouseDto;

import java.util.Set;

public interface HouseRepository {
    Set<HouseDto> findHouse();
}
