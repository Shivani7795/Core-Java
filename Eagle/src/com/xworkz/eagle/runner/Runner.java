package com.xworkz.eagle.runner;

import com.xworkz.eagle.dto.CompanyDto;
import com.xworkz.eagle.dto.CountryDto;
import com.xworkz.eagle.dto.CustomerDto;
import com.xworkz.eagle.repository.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        EducationRepository educationRepo = new EducationRepositoryImpl();
        DetailsRepository detailRepo = new DetailsRepositoryImpl(educationRepo);
        JobRepository jobRepo = new JobRepositoryImpl(detailRepo);
        SecurityRepository securityRepo = new SecurityRepositoryImpl(jobRepo);
        HouseRepository houseRepo = new HouseRepositoryImpl(securityRepo);
        CEORepository ceoRepo = new CEORepositoryImpl(houseRepo);
        CompanyRepository companyRepo = new CompanyRepositoryImpl(ceoRepo);
        VehicleRepository vehicleRepo = new VehicleRepositoryImpl(companyRepo);
        DriverRepository driverRepo = new DriverRepositoryImpl(vehicleRepo);
        PresidentRepository presidentRepo = new PresidentRepositoryImpl(driverRepo);
        CountryRepository countryRepo = new CountryRepositoryImpl(presidentRepo);
        PassportRepository passportRepo = new PassportRepositoryImpl(countryRepo);


        CustomerRepository customerRepository = new CustomerRepositoryImpl(passportRepo);
        Set<CustomerDto> customers = customerRepository.findCustomer();


        System.out.println("Sort by Company name in desc:");
        customers.stream()
                .sorted(Comparator.comparing(
                        c -> c.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getName(), Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("------------------------------------");
        System.out.println("Find by job role");
        Optional<CustomerDto> role=
                customers.stream().filter(a->a.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getRole().equalsIgnoreCase("software engineer"))
                        .findAny();
        role.ifPresent(System.out::println);

        System.out.println("------------------------------------");
        System.out.println("Sort country name by desc");
        customers.stream().sorted(Comparator.comparing(t->t.getPassport().getCountry().getName(), Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("------------------------------------");
        System.out.println("Sort by education: qualification");
        customers.stream().sorted(Comparator.comparing(e->e.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getCeo().getHouse().getSecurity().getJob().getDetail().getEducation().getQualification()))
                .forEach(System.out::println);

        System.out.println("------------------------------------");
        System.out.println("7. Collect all unique Country");
        Set<CountryDto> set = customers.stream().map(w->w.getPassport().getCountry()).collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}