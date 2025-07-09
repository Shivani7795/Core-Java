package com.xworkz.repunzel.Runner;

import com.xworkz.repunzel.dto.ApplicationDto;
import com.xworkz.repunzel.dto.ApplicationType;
import com.xworkz.repunzel.repository.ApplicationRepository;
import com.xworkz.repunzel.repository.ApplicationRepositoryImpl;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
        List<ApplicationDto> myList = applicationRepository.findAll();

        List<ApplicationDto> applicationType = myList.stream().filter(applicationDto -> applicationDto.getType().equals(ApplicationType.MUSIC)).collect(Collectors.toList());
        applicationType.forEach(System.out::println);
        System.out.println("-----------------------");

        List<ApplicationDto> chargePerUser = myList.stream().filter(applicationDto -> applicationDto.getAppName().equalsIgnoreCase("GameZone")).collect(Collectors.toList());
        chargePerUser.forEach(System.out::println);
        System.out.println("-----------------------");

        List<ApplicationDto> sortedByDateDesc = myList.stream().sorted(Comparator.comparing(ApplicationDto::getCratedDate).reversed()).collect(Collectors.toList());
        sortedByDateDesc.forEach(System.out::println);
        System.out.println("-----------------------");

        myList.stream().filter(app -> app.getAppName().equalsIgnoreCase("GameZone") && app.getType() == ApplicationType.GAMES).map(ApplicationDto::getVersion).forEach(System.out::println);
        String targetUserName = "Shivani";
        System.out.println("-----------------------");

        myList.stream().filter(app -> app.getUserName().stream().anyMatch(user -> user.getUserName().equalsIgnoreCase(targetUserName))).forEach(System.out::println);



    }
}
