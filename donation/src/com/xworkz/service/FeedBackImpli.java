package com.xworkz.service;

import com.xworkz.Dto.FeedBackDto;

public class FeedBackImpli implements FeedBackService{
    @Override
    public boolean save(FeedBackDto feedBackDto) {
        String name = feedBackDto.getname();
        if (name != null && name.length() > 2) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        String subject = feedBackDto.getSubject();
        if (subject != null && subject.length() > 2) {
            System.out.println("valid subject");
        } else {
            System.out.println("invalid subject");
        }
        return true;
    }
}
