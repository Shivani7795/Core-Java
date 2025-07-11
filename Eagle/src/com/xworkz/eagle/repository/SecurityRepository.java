package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.SecurityDto;

import java.util.Set;

public interface SecurityRepository {
    Set<SecurityDto> findSecurity();
}
