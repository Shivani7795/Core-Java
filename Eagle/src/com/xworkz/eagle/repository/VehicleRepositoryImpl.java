package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CompanyDto;
import com.xworkz.eagle.dto.VehicleDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleRepositoryImpl implements VehicleRepository {

    private final Set<VehicleDto> vehicleSet = new HashSet<>();

    public VehicleRepositoryImpl(CompanyRepository companyRepository) {
        Iterator<CompanyDto> iterator = companyRepository.findCompany().iterator();

        vehicleSet.add(new VehicleDto("Swift", "KA01AB1234", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Activa", "KA02CD5678", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Pulsar", "KA03EF9012", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("i20", "KA04GH3456", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Splendor", "KA05IJ7890", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Dio", "KA06KL1234", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Ciaz", "KA07MN5678", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Access", "KA08OP9012", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Apache", "KA09QR3456", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("XUV300", "KA10ST7890", "Car", iterator.next()));

        vehicleSet.add(new VehicleDto("R15", "KA11UV1234", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Fascino", "KA12WX5678", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Creta", "KA13YZ9012", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Bullet", "KA14AB3456", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Ntorq", "KA15CD7890", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Baleno", "KA16EF1234", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Scorpio", "KA17GH5678", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Ray ZR", "KA18IJ9012", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("Glamour", "KA19KL3456", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Ertiga", "KA20MN7890", "Car", iterator.next()));

        vehicleSet.add(new VehicleDto("Vespa", "KA21OP1234", "Scooter", iterator.next()));
        vehicleSet.add(new VehicleDto("FZ", "KA22QR5678", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Tiago", "KA23ST9012", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Dominar", "KA24UV3456", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("Jazz", "KA25WX7890", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("Classic 350", "KA26YZ1234", "Bike", iterator.next()));
        vehicleSet.add(new VehicleDto("XL100", "KA27AB5678", "Moped", iterator.next()));
        vehicleSet.add(new VehicleDto("Innova", "KA28CD9012", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("WagonR", "KA29EF3456", "Car", iterator.next()));
        vehicleSet.add(new VehicleDto("TVS Jupiter", "KA30GH7890", "Scooter", iterator.next()));
    }

    @Override
    public Set<VehicleDto> findVehicle() {
        return vehicleSet;
    }
}
