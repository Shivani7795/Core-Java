package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.FridgeDTO;

import java.util.Collection;

public interface FridgeRepository {
    Collection<FridgeDTO> findAllFridge();

}
