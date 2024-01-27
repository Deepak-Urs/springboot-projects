package com.group.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group.quizservice.model.Quiz;


public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
