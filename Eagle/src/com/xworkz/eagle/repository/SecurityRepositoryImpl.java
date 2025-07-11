package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.JobDto;
import com.xworkz.eagle.dto.SecurityDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecurityRepositoryImpl implements SecurityRepository {

    private final Set<SecurityDto> securitySet = new HashSet<>();

    public SecurityRepositoryImpl(JobRepository jobRepository) {
        Iterator<JobDto> iterator = jobRepository.findJob().iterator();

        securitySet.add(new SecurityDto("Ramesh", 101, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Suresh", 102, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Ganesh", 103, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Mahesh", 104, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Harish", 105, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Lokesh", 106, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Rajesh", 107, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Naveen", 108, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Kiran", 109, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Arun", 110, "Day", iterator.next()));

        securitySet.add(new SecurityDto("Vijay", 111, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Prakash", 112, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Umesh", 113, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Naresh", 114, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Dinesh", 115, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Vinay", 116, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Sunil", 117, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Anil", 118, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Yogesh", 119, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Sanjay", 120, "Day", iterator.next()));

        securitySet.add(new SecurityDto("Ajay", 121, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Shiv", 122, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Ravi", 123, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Deepak", 124, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Vikas", 125, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Rohit", 126, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Sathish", 127, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Mohan", 128, "Day", iterator.next()));
        securitySet.add(new SecurityDto("Karthik", 129, "Night", iterator.next()));
        securitySet.add(new SecurityDto("Manoj", 130, "Day", iterator.next()));
    }

    @Override
    public Set<SecurityDto> findSecurity() {
        return securitySet;
    }
}
