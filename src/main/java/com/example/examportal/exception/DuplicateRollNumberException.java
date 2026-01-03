package com.example.examportal.exception;

public class DuplicateRollNumberException extends RuntimeException{

    public DuplicateRollNumberException(String message){
        super(message);
    }
}
