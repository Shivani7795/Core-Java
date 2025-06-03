package com.xworkz.exception.Runner;

import com.xworkz.exception.exceptions.PasswordException;

public class Password {
    public static void main(String[] args) {
        String password = "pass123";
        if (password.length() < 8 || password.length() > 16) {
            throw new PasswordException("Password must be at greater than 8 and more than 16 characters.");
        }
        System.out.println("Password is valid.");
    }
}
