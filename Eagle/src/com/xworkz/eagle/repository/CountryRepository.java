package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CountryDto;

import java.util.Set;

public interface CountryRepository {
    Set<CountryDto> findCountry();
}
