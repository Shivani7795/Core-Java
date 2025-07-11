package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.PresidentDto;

import java.util.Set;

public interface PresidentRepository {
    Set<PresidentDto> findPresident();
}
