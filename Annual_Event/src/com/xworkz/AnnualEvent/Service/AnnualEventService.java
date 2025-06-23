package com.xworkz.AnnualEvent.Service;

import com.xworkz.AnnualEvent.Dto.AnnualEventDto;

import java.util.Optional;

public interface AnnualEventService {
    boolean save(AnnualEventDto annualEventDto);

    default Optional<AnnualEventDto> findId(int eventId){
        return Optional.empty();
    }
}
