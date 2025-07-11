package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DriverDto;
import com.xworkz.eagle.dto.PresidentDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PresidentRepositoryImpl implements PresidentRepository {

    private final Set<PresidentDto> presidentSet = new HashSet<>();

    public PresidentRepositoryImpl(DriverRepository driverRepository) {
        Iterator<DriverDto> iterator = driverRepository.findDriver().iterator();

        presidentSet.add(new PresidentDto("John Adams", 60, "Federalist", iterator.next()));
        presidentSet.add(new PresidentDto("Thomas Jefferson", 57, "Democratic-Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Abraham Lincoln", 56, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Theodore Roosevelt", 50, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Franklin D. Roosevelt", 63, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Harry S. Truman", 61, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Dwight D. Eisenhower", 62, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("John F. Kennedy", 46, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Richard Nixon", 55, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Jimmy Carter", 52, "Democratic", iterator.next()));

        presidentSet.add(new PresidentDto("Ronald Reagan", 69, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("George H. W. Bush", 64, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Bill Clinton", 46, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("George W. Bush", 54, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Barack Obama", 47, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Donald Trump", 70, "Republican", iterator.next()));
        presidentSet.add(new PresidentDto("Joe Biden", 78, "Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Narendra Modi", 72, "BJP", iterator.next()));
        presidentSet.add(new PresidentDto("Ram Nath Kovind", 75, "BJP", iterator.next()));
        presidentSet.add(new PresidentDto("Droupadi Murmu", 64, "BJP", iterator.next()));

        presidentSet.add(new PresidentDto("Vladimir Putin", 71, "Independent", iterator.next()));
        presidentSet.add(new PresidentDto("Emmanuel Macron", 44, "La République En Marche!", iterator.next()));
        presidentSet.add(new PresidentDto("Xi Jinping", 70, "Communist Party", iterator.next()));
        presidentSet.add(new PresidentDto("Yoon Suk-yeol", 62, "People Power Party", iterator.next()));
        presidentSet.add(new PresidentDto("Fumio Kishida", 66, "Liberal Democratic", iterator.next()));
        presidentSet.add(new PresidentDto("Rishi Sunak", 43, "Conservative", iterator.next()));
        presidentSet.add(new PresidentDto("Justin Trudeau", 51, "Liberal Party", iterator.next()));
        presidentSet.add(new PresidentDto("Luis Inácio Lula da Silva", 77, "Workers' Party", iterator.next()));
        presidentSet.add(new PresidentDto("Cyril Ramaphosa", 71, "ANC", iterator.next()));
        presidentSet.add(new PresidentDto("Alberto Fernández", 65, "Justicialist Party", iterator.next()));
        presidentSet.add(new PresidentDto("Sheikh Mohamed bin Zayed", 62, "Independent", iterator.next()));
    }

    @Override
    public Set<PresidentDto> findPresident() {
        return presidentSet;
    }
}
