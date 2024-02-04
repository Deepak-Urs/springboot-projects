package com.group.quizservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.group.quizservice.dao.QuizDao;
import com.group.quizservice.feign.QuizInterface;
import com.group.quizservice.model.QuestionWrapper;
import com.group.quizservice.model.Quiz;
import com.group.quizservice.model.Response;

@Service
public class QuizService {
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizInterface quizInterface;

	public ResponseEntity<List<Integer>> createQuiz(String categoryName, Integer numQuestions, String title) {
		List<Integer> questions = quizInterface.getQuestionsForQuiz(categoryName, numQuestions).getBody();
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questions); // questionIds
		quizDao.save(quiz);
		
		return new ResponseEntity<List<Integer>>(HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		Quiz quiz = quizDao.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);
		
		return questions;
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		ResponseEntity<Integer> score = quizInterface.getScore(responses);
		return score;
	}
}
