package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CompanyDto;

import java.util.Set;

public interface CompanyRepository {
    Set<CompanyDto> findCompany();
}
