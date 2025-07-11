package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DetailsDto;
import com.xworkz.eagle.dto.JobDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JobRepositoryImpl implements JobRepository {

    private final Set<JobDto> jobSet = new HashSet<>();

    public JobRepositoryImpl(DetailsRepository detailsRepository) {
        Iterator<DetailsDto> iterator = detailsRepository.findDetails().iterator();

        jobSet.add(new JobDto("Software Engineer", 85000, "IT", iterator.next()));
        jobSet.add(new JobDto("Data Analyst", 70000, "Analytics", iterator.next()));
        jobSet.add(new JobDto("HR Manager", 90000, "Human Resources", iterator.next()));
        jobSet.add(new JobDto("Project Manager", 120000, "Management", iterator.next()));
        jobSet.add(new JobDto("QA Tester", 60000, "Quality Assurance", iterator.next()));
        jobSet.add(new JobDto("DevOps Engineer", 95000, "IT", iterator.next()));
        jobSet.add(new JobDto("UI/UX Designer", 75000, "Design", iterator.next()));
        jobSet.add(new JobDto("Backend Developer", 88000, "Development", iterator.next()));
        jobSet.add(new JobDto("Frontend Developer", 87000, "Development", iterator.next()));
        jobSet.add(new JobDto("Cloud Architect", 130000, "Infrastructure", iterator.next()));

        jobSet.add(new JobDto("Security Officer", 50000, "Security", iterator.next()));
        jobSet.add(new JobDto("Network Engineer", 89000, "IT", iterator.next()));
        jobSet.add(new JobDto("Technical Writer", 65000, "Documentation", iterator.next()));
        jobSet.add(new JobDto("AI Researcher", 150000, "R&D", iterator.next()));
        jobSet.add(new JobDto("Product Owner", 110000, "Product", iterator.next()));
        jobSet.add(new JobDto("Business Analyst", 80000, "Business", iterator.next()));
        jobSet.add(new JobDto("Support Engineer", 62000, "Customer Service", iterator.next()));
        jobSet.add(new JobDto("Database Administrator", 92000, "IT", iterator.next()));
        jobSet.add(new JobDto("System Analyst", 78000, "IT", iterator.next()));
        jobSet.add(new JobDto("Ethical Hacker", 98000, "Cybersecurity", iterator.next()));

        jobSet.add(new JobDto("Marketing Manager", 97000, "Marketing", iterator.next()));
        jobSet.add(new JobDto("Finance Analyst", 89000, "Finance", iterator.next()));
        jobSet.add(new JobDto("Legal Advisor", 100000, "Legal", iterator.next()));
        jobSet.add(new JobDto("Operations Lead", 95000, "Operations", iterator.next()));
        jobSet.add(new JobDto("Mobile Developer", 85000, "Development", iterator.next()));
        jobSet.add(new JobDto("SEO Specialist", 68000, "Marketing", iterator.next()));
        jobSet.add(new JobDto("Sales Executive", 72000, "Sales", iterator.next()));
        jobSet.add(new JobDto("Content Strategist", 71000, "Media", iterator.next()));
        jobSet.add(new JobDto("Graphic Designer", 67000, "Design", iterator.next()));
        jobSet.add(new JobDto("Scrum Master", 105000, "Agile", iterator.next()));
    }

    @Override
    public Set<JobDto> findJob() {
        return jobSet;
    }
}
