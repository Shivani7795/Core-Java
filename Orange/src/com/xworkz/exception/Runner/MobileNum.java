package com.xworkz.exception.Runner;
import com.xworkz.exception.exceptions.MobileNumException;

public class MobileNum {
    public static void main(String[] args) {
        Long number = 12346789l;
        if (String.valueOf(number).length()!= 10) {
            throw new MobileNumException("Number should be 10");
        }
        System.out.println("Number is valid");
    }
}