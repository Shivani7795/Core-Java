package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.FurnitureDTO;

import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDTO>findAllFurniture();
}
