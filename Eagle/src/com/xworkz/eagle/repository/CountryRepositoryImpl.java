package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CountryDto;
import com.xworkz.eagle.dto.PresidentDto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountryRepositoryImpl implements CountryRepository {

    private final Set<CountryDto> countrySet = new HashSet<>();

    public CountryRepositoryImpl(PresidentRepository presidentRepository) {
        Iterator<PresidentDto> iterator = presidentRepository.findPresident().iterator();

        countrySet.add(new CountryDto("India", "IN", "Asia", iterator.next()));
        countrySet.add(new CountryDto("United States", "US", "North America", iterator.next()));
        countrySet.add(new CountryDto("United Kingdom", "UK", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Germany", "DE", "Europe", iterator.next()));
        countrySet.add(new CountryDto("France", "FR", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Japan", "JP", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Australia", "AU", "Oceania", iterator.next()));
        countrySet.add(new CountryDto("Canada", "CA", "North America", iterator.next()));
        countrySet.add(new CountryDto("Brazil", "BR", "South America", iterator.next()));
        countrySet.add(new CountryDto("South Africa", "ZA", "Africa", iterator.next()));

        countrySet.add(new CountryDto("Russia", "RU", "Europe/Asia", iterator.next()));
        countrySet.add(new CountryDto("China", "CN", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Mexico", "MX", "North America", iterator.next()));
        countrySet.add(new CountryDto("Italy", "IT", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Spain", "ES", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Singapore", "SG", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Argentina", "AR", "South America", iterator.next()));
        countrySet.add(new CountryDto("South Korea", "KR", "Asia", iterator.next()));
        countrySet.add(new CountryDto("New Zealand", "NZ", "Oceania", iterator.next()));
        countrySet.add(new CountryDto("Egypt", "EG", "Africa", iterator.next()));

        countrySet.add(new CountryDto("Norway", "NO", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Sweden", "SE", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Switzerland", "CH", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Thailand", "TH", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Malaysia", "MY", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Vietnam", "VN", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Indonesia", "ID", "Asia", iterator.next()));
        countrySet.add(new CountryDto("Portugal", "PT", "Europe", iterator.next()));
        countrySet.add(new CountryDto("Saudi Arabia", "SA", "Asia", iterator.next()));
        countrySet.add(new CountryDto("UAE", "AE", "Asia", iterator.next()));
    }
    @Override
    public Set<CountryDto> findCountry() {
        return countrySet;
    }
}
