package com.xworkz.Red.Repository;

import com.xworkz.Red.Dto.StampedeCaseDto;

public interface StampedeCaseRepository {
    boolean persist(StampedeCaseDto stampedeCaseDto);
}
