package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.PassportDto;

import java.util.Set;

public interface PassportRepository {
    Set<PassportDto> findPassport();
}
