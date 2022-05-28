package com.example.second_year.service.impl;

import com.example.second_year.data.Question;
import com.example.second_year.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class JavaQuestionService implements QuestionService {
    private Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public Question add(String question, String answer){
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question){
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question){
        for (int i = 0;i < questions.size();i++){
            if (questions.contains(question)){
                questions.remove(question);
                return question;
            }
        }
        throw new IllegalArgumentException("Question not found");
    }

    @Override
    public Collection<Question> getAll(){
        return questions;
    }



    @Override
    public Question getRandomQuestion(){
        Random random = new Random();
        Integer i = random.nextInt(questions.size());
        return questions.stream().collect(Collectors.toList()).get(i);
    }
}
