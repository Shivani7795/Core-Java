package com.xworkz.AnnualEvent.Repository;

import com.xworkz.AnnualEvent.Dto.AnnualEventDto;

import java.util.Optional;

public interface AnnualEventRepository {
    boolean persist(AnnualEventDto annualEventDto);

    default Optional<AnnualEventDto> findId(int eventId){
        return Optional.empty();
    }

}
