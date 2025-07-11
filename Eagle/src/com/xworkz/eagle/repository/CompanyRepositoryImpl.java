package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CEODto;
import com.xworkz.eagle.dto.CompanyDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompanyRepositoryImpl implements CompanyRepository {

    private final Set<CompanyDto> companySet = new HashSet<>();

    public CompanyRepositoryImpl(CEORepository ceoRepository) {
        Iterator<CEODto> iterator = ceoRepository.findCEO().iterator();

        companySet.add(new CompanyDto("Infosys", 101, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("TCS", 102, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("Wipro", 103, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("HCL", 104, "Noida", iterator.next()));
        companySet.add(new CompanyDto("Tech Mahindra", 105, "Pune", iterator.next()));
        companySet.add(new CompanyDto("Google India", 106, "Hyderabad", iterator.next()));
        companySet.add(new CompanyDto("Amazon India", 107, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Microsoft India", 108, "Hyderabad", iterator.next()));
        companySet.add(new CompanyDto("Flipkart", 109, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Cognizant", 110, "Chennai", iterator.next()));

        companySet.add(new CompanyDto("Capgemini", 111, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("Zoho", 112, "Chennai", iterator.next()));
        companySet.add(new CompanyDto("Adobe India", 113, "Noida", iterator.next()));
        companySet.add(new CompanyDto("Oracle India", 114, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("L&T Infotech", 115, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("Mindtree", 116, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Dell India", 117, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("IBM India", 118, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Hexaware", 119, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("Persistent", 120, "Pune", iterator.next()));

        companySet.add(new CompanyDto("Freshworks", 121, "Chennai", iterator.next()));
        companySet.add(new CompanyDto("Paytm", 122, "Noida", iterator.next()));
        companySet.add(new CompanyDto("Reliance Jio", 123, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("Bajaj Finserv", 124, "Pune", iterator.next()));
        companySet.add(new CompanyDto("Ola Cabs", 125, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Swiggy", 126, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Zomato", 127, "Gurgaon", iterator.next()));
        companySet.add(new CompanyDto("PhonePe", 128, "Bangalore", iterator.next()));
        companySet.add(new CompanyDto("Nykaa", 129, "Mumbai", iterator.next()));
        companySet.add(new CompanyDto("BigBasket", 130, "Bangalore", iterator.next()));
    }
    @Override
    public Set<CompanyDto> findCompany() {
        return companySet;
    }
}
