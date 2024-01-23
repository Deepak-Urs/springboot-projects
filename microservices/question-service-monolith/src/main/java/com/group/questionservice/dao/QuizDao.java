package com.group.questionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group.questionservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
