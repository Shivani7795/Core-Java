package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DriverDto;

import java.util.Set;

public interface DriverRepository {
    Set<DriverDto> findDriver();
}
