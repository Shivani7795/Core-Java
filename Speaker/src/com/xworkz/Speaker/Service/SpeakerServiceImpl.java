package com.xworkz.Speaker.Service;

import com.xworkz.Speaker.Dto.SpeakerDto;

import com.xworkz.Speaker.Repository.SpeakerRepository;
import com.xworkz.Speaker.Repository.SpeakerRepositoryImpl;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class SpeakerServiceImpl implements SpeakerService{
    @Override
    public String save(SpeakerDto speakerDto) {

        if (speakerDto == null) {
            System.err.println("SpeakerDto is null");
            return "Failed";
        }

        if (speakerDto.getBrand() == null || speakerDto.getBrand().isEmpty()) {
            System.err.println("Brand is null or empty");
            return "Failed";
        }

        if (speakerDto.getSpeakerType() == null || speakerDto.getSpeakerType().isEmpty()) {
            System.err.println("Speaker type is null or empty");
            return "Failed";
        }

        if (speakerDto.getPrice() <= 0) {
            System.err.println("Price is missing or invalid");
            return "Failed";
        }

        if (speakerDto.getWirelessRange() <= 0) {
            System.err.println("Wireless range is missing or invalid");
            return "Failed";
        }

        if (speakerDto.getColor() == null || speakerDto.getColor().isEmpty()) {
            System.err.println("Color is null or empty");
            return "Failed";
        }

        if (speakerDto.getBluetooth() == null || speakerDto.getBluetooth().isEmpty()) {
            System.err.println("Bluetooth info is null or empty");
            return "Failed";
        }

        SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();
        return speakerRepository.persist(speakerDto);
    }
}



