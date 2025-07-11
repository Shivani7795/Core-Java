package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DetailsDto;

import java.util.Set;

public interface DetailsRepository {
    Set<DetailsDto> findDetails();
}
