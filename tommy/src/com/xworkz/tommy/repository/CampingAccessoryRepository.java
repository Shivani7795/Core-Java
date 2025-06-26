package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.CampingAccessoryDTO;

import java.util.Collection;

public interface CampingAccessoryRepository {
    Collection<CampingAccessoryDTO> findAllAccessory();

}
