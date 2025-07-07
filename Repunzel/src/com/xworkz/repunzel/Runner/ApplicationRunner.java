package com.xworkz.repunzel.Runner;

import com.xworkz.repunzel.dto.ApplicationDto;
import com.xworkz.repunzel.dto.ApplicationType;
import com.xworkz.repunzel.repository.ApplicationRepository;
import com.xworkz.repunzel.repository.ApplicationRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
        List<ApplicationDto> myList = applicationRepository.findAll();

        List<ApplicationDto> applicationType = myList.stream().filter(applicationDto -> applicationDto.getType().equals(ApplicationType.MUSIC)).collect(Collectors.toList());
        applicationType.forEach(System.out::println);

        System.out.println("-----------------------");
        List<ApplicationDto> chargePerUser = myList.stream().filter(applicationDto -> applicationDto.getAppName().equalsIgnoreCase("GameZone")).collect(Collectors.toList());
    }
}
