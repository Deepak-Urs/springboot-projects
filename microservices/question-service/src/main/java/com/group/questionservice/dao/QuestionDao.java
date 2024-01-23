package com.group.questionservice.dao;

import org.springframework.stereotype.Repository;

import com.group.questionservice.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	List<Question> findByCategory(String category);

	@Query(value="SELECT * FROM question q WHERE q.category=:category LIMIT :numQ", nativeQuery = true)
	List<Question> findRandomQuestionsByCategory(String category, Integer numQ);
}
