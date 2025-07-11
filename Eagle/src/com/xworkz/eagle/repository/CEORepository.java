package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CEODto;

import java.util.Set;

public interface CEORepository {
    Set<CEODto> findCEO();
}
