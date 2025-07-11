package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.EducationDto;

import java.util.Set;

public interface EducationRepository {
    Set<EducationDto> findEducation();
}
