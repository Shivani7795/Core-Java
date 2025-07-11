package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DriverDto;
import com.xworkz.eagle.dto.VehicleDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverRepositoryImpl implements DriverRepository {

    private final Set<DriverDto> driverSet = new HashSet<>();

    public DriverRepositoryImpl(VehicleRepository vehicleRepository) {
        Iterator<VehicleDto> iterator = vehicleRepository.findVehicle().iterator();

        driverSet.add(new DriverDto("Arun", 1001, "5 years", iterator.next()));
        driverSet.add(new DriverDto("Bhaskar", 1002, "3 years", iterator.next()));
        driverSet.add(new DriverDto("Chetan", 1003, "8 years", iterator.next()));
        driverSet.add(new DriverDto("Divya", 1004, "2 years", iterator.next()));
        driverSet.add(new DriverDto("Eshwar", 1005, "6 years", iterator.next()));
        driverSet.add(new DriverDto("Farah", 1006, "4 years", iterator.next()));
        driverSet.add(new DriverDto("Ganesh", 1007, "10 years", iterator.next()));
        driverSet.add(new DriverDto("Harsha", 1008, "1 year", iterator.next()));
        driverSet.add(new DriverDto("Indu", 1009, "5 years", iterator.next()));
        driverSet.add(new DriverDto("Jagadish", 1010, "7 years", iterator.next()));

        driverSet.add(new DriverDto("Kiran", 1011, "9 years", iterator.next()));
        driverSet.add(new DriverDto("Lavanya", 1012, "3 years", iterator.next()));
        driverSet.add(new DriverDto("Manoj", 1013, "6 years", iterator.next()));
        driverSet.add(new DriverDto("Neha", 1014, "2 years", iterator.next()));
        driverSet.add(new DriverDto("Omkar", 1015, "5 years", iterator.next()));
        driverSet.add(new DriverDto("Pooja", 1016, "4 years", iterator.next()));
        driverSet.add(new DriverDto("Qadir", 1017, "7 years", iterator.next()));
        driverSet.add(new DriverDto("Ramesh", 1018, "1 year", iterator.next()));
        driverSet.add(new DriverDto("Sneha", 1019, "8 years", iterator.next()));
        driverSet.add(new DriverDto("Tejas", 1020, "3 years", iterator.next()));

        driverSet.add(new DriverDto("Uma", 1021, "6 years", iterator.next()));
        driverSet.add(new DriverDto("Vinay", 1022, "2 years", iterator.next()));
        driverSet.add(new DriverDto("Wasim", 1023, "9 years", iterator.next()));
        driverSet.add(new DriverDto("Xavier", 1024, "4 years", iterator.next()));
        driverSet.add(new DriverDto("Yamini", 1025, "5 years", iterator.next()));
        driverSet.add(new DriverDto("Zubair", 1026, "3 years", iterator.next()));
        driverSet.add(new DriverDto("Anjali", 1027, "7 years", iterator.next()));
        driverSet.add(new DriverDto("Bharat", 1028, "6 years", iterator.next()));
        driverSet.add(new DriverDto("Charu", 1029, "2 years", iterator.next()));
        driverSet.add(new DriverDto("Deepak", 1030, "1 year", iterator.next()));
    }

    @Override
    public Set<DriverDto> findDriver() {
        return driverSet;
    }
}
