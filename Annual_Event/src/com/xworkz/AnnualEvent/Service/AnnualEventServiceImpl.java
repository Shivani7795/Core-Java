package com.xworkz.AnnualEvent.Service;

import com.xworkz.AnnualEvent.Dto.AnnualEventDto;
import com.xworkz.AnnualEvent.Repository.AnnualEventRepository;
import com.xworkz.AnnualEvent.Repository.AnnualEventRepositoryImpl;

import java.util.Optional;

public class AnnualEventServiceImpl implements AnnualEventService{
    public AnnualEventServiceImpl(){
        System.out.println("constructor in service");
    }
    AnnualEventRepository annualEventRepository=new AnnualEventRepositoryImpl();
    @Override
    public boolean save(AnnualEventDto annualEventDto){
        if(annualEventDto!=null) {
            if (annualEventDto.getInstituteName() == null) {
                System.out.println("Institute name is empty");
                return false;
            }

            if (annualEventDto.getLocation() == null) {
                System.out.println("Location is empty");
                return false;
            }

            if (annualEventDto.getGuestName() == null) {
                System.out.println("Guest name is empty");
                return false;
            }

            if (annualEventDto.getEDate() == null) {
                System.out.println("Event date is empty");
                return false;
            }
            if (annualEventDto.getChairs() <= 0) {
                System.out.println("Chairs must be greater than 0");
                return false;
            }
            System.out.println("data is correct");
            annualEventRepository.persist(annualEventDto);
            return true;
        }
        System.out.println("data is valid");
        return false;
    }
    @Override
    public Optional<AnnualEventDto> findId(int eventId){
        System.out.println("id method in service impl");

        if(eventId>0){
            System.out.println("event id is valid");
            return annualEventRepository.findId(eventId);
    }
        System.out.println("event id is invalid");
        return Optional.empty();
    }
}
