package com.xworkz.exception.Runner;

import com.xworkz.exception.exceptions.AadharNumberException;

public class AadharNumber {
    public static void main(String[] args) {
        Long AadharNum=1234567891l;
            if (String.valueOf(AadharNum).length()!= 12) {
                throw new AadharNumberException("Aadhar Number should be 12");
            }
            System.out.println("Aadhar Number is valid");
        }
    }
