package org.example.springrest;

public class CustomerException extends RuntimeException {
    public CustomerException(String message) {
        super(message);
    }
}
