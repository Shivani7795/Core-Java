package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.JobDto;

import java.util.Set;

public interface JobRepository {
    Set<JobDto> findJob();
}
