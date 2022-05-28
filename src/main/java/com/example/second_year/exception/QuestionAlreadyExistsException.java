package com.example.second_year.exception;

public class QuestionAlreadyExistsException extends RuntimeException{
        public QuestionAlreadyExistsException(String message) {
            super(message);
        }
}
