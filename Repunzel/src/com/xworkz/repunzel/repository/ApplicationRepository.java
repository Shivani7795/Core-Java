package com.xworkz.repunzel.repository;

import com.xworkz.repunzel.dto.ApplicationDto;

import java.util.List;

public interface ApplicationRepository {
    List<ApplicationDto> findAll();
}
