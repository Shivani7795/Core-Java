package com.xworkz.service;

import com.xworkz.Dto.DonationDto;

public class DonationServiceImplimentation implements DService {
    @Override
    public boolean save(DonationDto donationDto) {
        String name = donationDto.getName();
        if (name != null&& name.length()>2) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
    return true;}
}
