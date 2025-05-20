package com.xworkz.service;

import com.xworkz.Dto.FIRDto;

public class FirServiceImpli implements FIRService {
    @Override
    public boolean save(FIRDto fIRDto) {
        String name = fIRDto.getName();
        if (name != null && name.length()>=2) {
            System.out.println("valid name");
        }else{
            System.out.println("invalid name");
            return false;
        }
        return true;
    }
}
