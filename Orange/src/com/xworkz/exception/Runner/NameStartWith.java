package com.xworkz.exception.Runner;

import com.xworkz.exception.exceptions.NameStartWithException;

public class NameStartWith {
    public static void main(String[] args) {
        String name = "2Sh";
        char firstLetter = name.charAt(0);
        if (Character.isDigit(firstLetter)) {
            throw new NameStartWithException("Username cannot start with a number!");
        }
        System.out.println("Username is valid");
    }
}
