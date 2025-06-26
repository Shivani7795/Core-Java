package com.xworkz.tommy.repository;

import com.xworkz.tommy.dto.SareeDTO;

import java.util.Collection;

public interface SareeRepository {
    Collection<SareeDTO> findAllSaree();

}
