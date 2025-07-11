package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CountryDto;
import com.xworkz.eagle.dto.PassportDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PassportRepositoryImpl implements PassportRepository {

    private final Set<PassportDto> passportSet = new HashSet<>();

    public PassportRepositoryImpl(CountryRepository countryRepository) {
        Iterator<CountryDto> iterator = countryRepository.findCountry().iterator();

        passportSet.add(new PassportDto("P1234561", "2015-01-10", "2025-01-10", iterator.next()));
        passportSet.add(new PassportDto("P1234562", "2016-03-12", "2026-03-12", iterator.next()));
        passportSet.add(new PassportDto("P1234563", "2017-05-15", "2027-05-15", iterator.next()));
        passportSet.add(new PassportDto("P1234564", "2018-07-20", "2028-07-20", iterator.next()));
        passportSet.add(new PassportDto("P1234565", "2019-09-25", "2029-09-25", iterator.next()));
        passportSet.add(new PassportDto("P1234566", "2020-11-01", "2030-11-01", iterator.next()));
        passportSet.add(new PassportDto("P1234567", "2021-02-14", "2031-02-14", iterator.next()));
        passportSet.add(new PassportDto("P1234568", "2022-04-17", "2032-04-17", iterator.next()));
        passportSet.add(new PassportDto("P1234569", "2023-06-21", "2033-06-21", iterator.next()));
        passportSet.add(new PassportDto("P1234570", "2014-08-19", "2024-08-19", iterator.next()));

        passportSet.add(new PassportDto("P1234571", "2015-10-23", "2025-10-23", iterator.next()));
        passportSet.add(new PassportDto("P1234572", "2016-12-30", "2026-12-30", iterator.next()));
        passportSet.add(new PassportDto("P1234573", "2017-03-05", "2027-03-05", iterator.next()));
        passportSet.add(new PassportDto("P1234574", "2018-05-09", "2028-05-09", iterator.next()));
        passportSet.add(new PassportDto("P1234575", "2019-07-13", "2029-07-13", iterator.next()));
        passportSet.add(new PassportDto("P1234576", "2020-09-17", "2030-09-17", iterator.next()));
        passportSet.add(new PassportDto("P1234577", "2021-11-21", "2031-11-21", iterator.next()));
        passportSet.add(new PassportDto("P1234578", "2022-01-25", "2032-01-25", iterator.next()));
        passportSet.add(new PassportDto("P1234579", "2023-03-29", "2033-03-29", iterator.next()));
        passportSet.add(new PassportDto("P1234580", "2014-06-02", "2024-06-02", iterator.next()));

        passportSet.add(new PassportDto("P1234581", "2015-08-06", "2025-08-06", iterator.next()));
        passportSet.add(new PassportDto("P1234582", "2016-10-10", "2026-10-10", iterator.next()));
        passportSet.add(new PassportDto("P1234583", "2017-12-14", "2027-12-14", iterator.next()));
        passportSet.add(new PassportDto("P1234584", "2018-02-18", "2028-02-18", iterator.next()));
        passportSet.add(new PassportDto("P1234585", "2019-04-22", "2029-04-22", iterator.next()));
        passportSet.add(new PassportDto("P1234586", "2020-06-26", "2030-06-26", iterator.next()));
        passportSet.add(new PassportDto("P1234587", "2021-08-30", "2031-08-30", iterator.next()));
        passportSet.add(new PassportDto("P1234588", "2022-11-03", "2032-11-03", iterator.next()));
        passportSet.add(new PassportDto("P1234589", "2023-01-07", "2033-01-07", iterator.next()));
        passportSet.add(new PassportDto("P1234590", "2014-03-11", "2024-03-11", iterator.next()));
    }

    @Override
    public Set<PassportDto> findPassport() {
        return passportSet;
    }
}
