package com.xworkz.Restaurant.Exception;

public class Below3RatingException extends RuntimeException {
    public Below3RatingException(String message) {
        super(message);
    }
}
