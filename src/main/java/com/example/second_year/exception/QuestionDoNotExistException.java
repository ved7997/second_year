package com.example.second_year.exception;

public class QuestionDoNotExistException extends RuntimeException{
    public QuestionDoNotExistException(String message) {
        super(message);
    }
}
