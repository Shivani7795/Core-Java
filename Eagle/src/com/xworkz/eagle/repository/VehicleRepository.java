package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.VehicleDto;

import java.util.Set;

public interface VehicleRepository {
    Set<VehicleDto> findVehicle();
}
