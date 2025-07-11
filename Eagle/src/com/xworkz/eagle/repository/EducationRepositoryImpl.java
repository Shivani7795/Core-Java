package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.EducationDto;

import java.util.HashSet;
import java.util.Set;

public class EducationRepositoryImpl implements EducationRepository {

    private final Set<EducationDto> educationSet = new HashSet<>();

    public EducationRepositoryImpl() {
        educationSet.add(new EducationDto("B.Tech", "VTU", 2018, 78.5));
        educationSet.add(new EducationDto("MBA", "IIM Bangalore", 2019, 85.3));
        educationSet.add(new EducationDto("B.Sc", "Bangalore University", 2017, 72.1));
        educationSet.add(new EducationDto("M.Sc", "Delhi University", 2020, 88.6));
        educationSet.add(new EducationDto("B.Com", "Mumbai University", 2016, 67.4));
        educationSet.add(new EducationDto("M.Com", "Christ University", 2021, 79.0));
        educationSet.add(new EducationDto("BA", "Osmania University", 2015, 65.2));
        educationSet.add(new EducationDto("MA", "JNU", 2022, 82.4));
        educationSet.add(new EducationDto("Diploma", "GTTC", 2014, 74.8));
        educationSet.add(new EducationDto("Ph.D", "IIT Bombay", 2023, 91.7));

        educationSet.add(new EducationDto("B.E", "RV College", 2019, 80.0));
        educationSet.add(new EducationDto("BBA", "Alliance University", 2017, 76.3));
        educationSet.add(new EducationDto("BCA", "IGNOU", 2018, 70.0));
        educationSet.add(new EducationDto("MCA", "Manipal University", 2020, 82.5));
        educationSet.add(new EducationDto("B.Arch", "SPA Delhi", 2016, 68.9));
        educationSet.add(new EducationDto("MBBS", "AIIMS", 2019, 89.5));
        educationSet.add(new EducationDto("MD", "JIPMER", 2021, 90.3));
        educationSet.add(new EducationDto("BDS", "MS Ramaiah", 2015, 73.4));
        educationSet.add(new EducationDto("MDS", "SDM Dharwad", 2022, 86.6));
        educationSet.add(new EducationDto("B.Pharm", "NIPER", 2017, 75.0));

        educationSet.add(new EducationDto("M.Pharm", "BITS Pilani", 2019, 84.2));
        educationSet.add(new EducationDto("LLB", "NLSIU", 2016, 77.9));
        educationSet.add(new EducationDto("LLM", "NLU Delhi", 2021, 88.1));
        educationSet.add(new EducationDto("CA", "ICAI", 2018, 91.0));
        educationSet.add(new EducationDto("CS", "ICSI", 2017, 80.5));
        educationSet.add(new EducationDto("ICWA", "ICWAI", 2016, 78.3));
        educationSet.add(new EducationDto("D.Ed", "Regional Institute", 2015, 69.4));
        educationSet.add(new EducationDto("B.Ed", "Karnataka University", 2020, 74.7));
        educationSet.add(new EducationDto("M.Ed", "Bangalore University", 2022, 81.9));
        educationSet.add(new EducationDto("PGDM", "Symbiosis", 2023, 85.8));
    }

    @Override
    public Set<EducationDto> findEducation() {
        return educationSet;
    }
}
