package com.example.second_year.service;

import com.example.second_year.data.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
