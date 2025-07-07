package com.xworkz.repunzel.repository;

import com.xworkz.repunzel.dto.ApplicationDto;
import com.xworkz.repunzel.dto.ApplicationType;
import com.xworkz.repunzel.dto.ApplicationVersion;
import com.xworkz.repunzel.dto.UserDto;
import jdk.nashorn.internal.runtime.Version;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplicationRepositoryImpl implements ApplicationRepository{
    public ApplicationRepositoryImpl(){
        System.out.println("ApplicationRepositoryImpl constructor");
    }

    @Override
    public List<ApplicationDto> findAll() {
        List<ApplicationDto> myapps = new ArrayList<>();
        UserDto user1 = new UserDto("Shivani", "shivani@gmail.com", 3576532555L);
        ApplicationDto app1 = new ApplicationDto("MyGame", LocalDate.of(2023, 5, 20), "250MB",
                false, 49, ApplicationVersion.VERSION1, ApplicationType.GAMES, Arrays.asList(user1));
        myapps.add(app1);

        ApplicationDto app2 = new ApplicationDto("FinancePro", LocalDate.of(2023, 8, 27), "254MB", true, 0, ApplicationVersion.VERSION3, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Arjun", "arjun@example.com", 9876543210L)));
        myapps.add(app2);

        ApplicationDto app3 = new ApplicationDto("MovieMagic", LocalDate.of(2022, 4, 4), "119MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Meera", "meera@example.com", 8123456789L)));
        myapps.add(app3);

        ApplicationDto app4 = new ApplicationDto("LearnNow", LocalDate.of(2024, 5, 10), "202MB", false, 15, ApplicationVersion.VERSION3, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Rahul", "rahul@example.com", 9988776655L)));
        myapps.add(app4);

        ApplicationDto app5 = new ApplicationDto("SocialSphere", LocalDate.of(2024, 12, 12), "52MB", false, 84, ApplicationVersion.VERSION3, ApplicationType.GAMES, Arrays.asList(new UserDto("Neha", "neha@example.com", 8899001122L)));
        myapps.add(app5);

        ApplicationDto app6 = new ApplicationDto("QuickBuy", LocalDate.of(2023, 3, 15), "95MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.SHOPPING, Arrays.asList(new UserDto("Karan", "karan@example.com", 7012345678L)));
        myapps.add(app6);

        ApplicationDto app7 = new ApplicationDto("EduTrack", LocalDate.of(2022, 11, 22), "168MB", false, 20, ApplicationVersion.VERSION2, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Ayesha", "ayesha@example.com", 9123456780L)));
        myapps.add(app7);

        ApplicationDto app8 = new ApplicationDto("GameZone", LocalDate.of(2021, 9, 1), "300MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.GAMES, Arrays.asList(new UserDto("Vikram", "vikram@example.com", 9811122233L)));
        myapps.add(app8);

        ApplicationDto app9 = new ApplicationDto("BudgetPlanner", LocalDate.of(2022, 6, 30), "132MB", false, 10, ApplicationVersion.VERSION2, ApplicationType.FINANCE, Arrays.asList(new UserDto("Sneha", "sneha@example.com", 8111222333L)));
        myapps.add(app9);

        ApplicationDto app10 = new ApplicationDto("StudySmart", LocalDate.of(2023, 1, 5), "200MB", true, 0, ApplicationVersion.VERSION3, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Ravi", "ravi@example.com", 7000011122L)));
        myapps.add(app10);

        ApplicationDto app11 = new ApplicationDto("PlayStream", LocalDate.of(2024, 2, 20), "270MB", false, 30, ApplicationVersion.VERSION1, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Divya", "divya@example.com", 8888777766L)));
        myapps.add(app11);

        ApplicationDto app12 = new ApplicationDto("ChatterBox", LocalDate.of(2023, 10, 14), "105MB", false, 25, ApplicationVersion.VERSION2, ApplicationType.MUSIC, Arrays.asList(new UserDto("Aman", "aman@example.com", 9988665544L)));
        myapps.add(app12);

        ApplicationDto app13 = new ApplicationDto("MusicMania", LocalDate.of(2022, 7, 17), "155MB", true, 0, ApplicationVersion.VERSION3, ApplicationType.MUSIC, Arrays.asList(new UserDto("Isha", "isha@example.com", 7777888899L)));
        myapps.add(app13);

        ApplicationDto app14 = new ApplicationDto("QuickCash", LocalDate.of(2023, 5, 25), "145MB", false, 12, ApplicationVersion.VERSION1, ApplicationType.FINANCE, Arrays.asList(new UserDto("Mohit", "mohit@example.com", 6655443322L)));
        myapps.add(app14);

        ApplicationDto app15 = new ApplicationDto("eLearnPro", LocalDate.of(2024, 1, 2), "189MB", false, 9, ApplicationVersion.VERSION2, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Tanya", "tanya@example.com", 7445566778L)));
        myapps.add(app15);

        ApplicationDto app16 = new ApplicationDto("StreamNow", LocalDate.of(2022, 4, 18), "220MB", false, 15, ApplicationVersion.VERSION3, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Nikhil", "nikhil@example.com", 9111222233L)));
        myapps.add(app16);

        ApplicationDto app17 = new ApplicationDto("FinExpert", LocalDate.of(2023, 2, 28), "130MB", true, 0, ApplicationVersion.VERSION2, ApplicationType.FINANCE, Arrays.asList(new UserDto("Sana", "sana@example.com", 9111333444L)));
        myapps.add(app17);

        ApplicationDto app18 = new ApplicationDto("GameBlast", LocalDate.of(2021, 12, 8), "310MB", false, 35, ApplicationVersion.VERSION1, ApplicationType.GAMES, Arrays.asList(new UserDto("Rahul", "rahul@example.com", 8111222444L)));
        myapps.add(app18);

        ApplicationDto app19 = new ApplicationDto("StudyEdge", LocalDate.of(2022, 9, 30), "175MB", true, 0, ApplicationVersion.VERSION3, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Neha", "neha@example.com", 8333444555L)));
        myapps.add(app19);

        ApplicationDto app20 = new ApplicationDto("SocialBuzz", LocalDate.of(2023, 7, 19), "115MB", false, 19, ApplicationVersion.VERSION2, ApplicationType.SOCIAL, Arrays.asList(new UserDto("Rohit", "rohit@example.com", 8000111222L)));
        myapps.add(app20);

        ApplicationDto app41 = new ApplicationDto("PhotoEditPro", LocalDate.of(2023, 9, 17), "105MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Kriti", "kriti@example.com", 9123456789L)));
        myapps.add(app41);

        ApplicationDto app42 = new ApplicationDto("NewsToday", LocalDate.of(2022, 12, 12), "135MB", false, 6, ApplicationVersion.VERSION2, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Ramesh", "ramesh@example.com", 9001122334L)));
        myapps.add(app42);

        ApplicationDto app43 = new ApplicationDto("YogaGuru", LocalDate.of(2023, 4, 1), "120MB", false, 7, ApplicationVersion.VERSION3, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Meena", "meena@example.com", 9112233445L)));
        myapps.add(app43);

        ApplicationDto app44 = new ApplicationDto("HealthPlus", LocalDate.of(2024, 1, 10), "160MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Karan", "karan@example.com", 9223344556L)));
        myapps.add(app44);

        ApplicationDto app45 = new ApplicationDto("CodeMaster", LocalDate.of(2023, 3, 15), "195MB", false, 11, ApplicationVersion.VERSION2, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Rekha", "rekha@example.com", 9334455667L)));
        myapps.add(app45);

        ApplicationDto app46 = new ApplicationDto("FastPay", LocalDate.of(2022, 7, 22), "100MB", false, 4, ApplicationVersion.VERSION3, ApplicationType.FINANCE, Arrays.asList(new UserDto("Suraj", "suraj@example.com", 9445566778L)));
        myapps.add(app46);

        ApplicationDto app47 = new ApplicationDto("KidsZone", LocalDate.of(2021, 8, 18), "210MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.ENTERTAINMENT, Arrays.asList(new UserDto("Pooja", "pooja@example.com", 9556677889L)));
        myapps.add(app47);

        ApplicationDto app48 = new ApplicationDto("MyBooks", LocalDate.of(2024, 2, 5), "175MB", false, 10, ApplicationVersion.VERSION2, ApplicationType.EDUCATION, Arrays.asList(new UserDto("Naveen", "naveen@example.com", 9667788990L)));
        myapps.add(app48);

        ApplicationDto app49 = new ApplicationDto("SnapTrack", LocalDate.of(2023, 5, 25), "140MB", false, 8, ApplicationVersion.VERSION3, ApplicationType.SOCIAL, Arrays.asList(new UserDto("Simran", "simran@example.com", 9778899001L)));
        myapps.add(app49);

        ApplicationDto app50 = new ApplicationDto("BudgetBuddy", LocalDate.of(2022, 6, 15), "130MB", true, 0, ApplicationVersion.VERSION1, ApplicationType.FINANCE, Arrays.asList(new UserDto("Anil", "anil@example.com", 9889900012L)));
        myapps.add(app50);

        return myapps;
    }
}
