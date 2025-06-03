package com.xworkz.exception.Runner;

import com.xworkz.exception.exceptions.NameStartWithException;

public class NameLessThan {
    public static void main(String[] args) {
        String name = "Sh";
        if (name.length() < 3) {
            throw new NameStartWithException("Username must be at least 3 characters long.");
        }
        System.out.println("Valid username: " + name);
    }
}
