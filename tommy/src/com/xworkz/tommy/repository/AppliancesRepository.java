package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.AppliancesDTO;

import java.util.Collection;

public interface AppliancesRepository {
    Collection<AppliancesDTO> findAllAppliances();
}
