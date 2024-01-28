package com.group.quizservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.group.quizservice.dao.QuizDao;
import com.group.quizservice.model.QuestionWrapper;
import com.group.quizservice.model.Quiz;
import com.group.quizservice.model.Response;

@Service
public class QuizService {
	@Autowired
	QuizDao quizDao;
	
//	@Autowired
//	QuestionDao questionDao;
//
	public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {
		// TODO Auto-generated method stub
//		List<Integer> questions = // call generate url by using REST-Template to http://localhost:8080/question/generate
//				1. TO identify the service url, we use FEIGN client - declarative way of calling other service
//				2. Next we need service discovery to be done viz, question service dscovery by quiz service. We use eureka service by netflix
//		
//		
//		Quiz quiz = new Quiz();
//		quiz.setTitle(title);
//		quiz.setQuestions(questions);
//		quizDao.save(quiz);
		
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
		
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//		Optional<Quiz> quiz = quizDao.findById(id);
//		List<Question> questionsFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionsForUser = new ArrayList<>();
//		
//		for(Question q: questionsFromDB) {
//			QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestion(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
//			questionsForUser.add(qw);
//		}
		
		return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
		
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
//		Quiz quiz = quizDao.findById(id).get();
//		List<Question> questions = quiz.getQuestions();
//		
		int correct = 0;
//		int i = 0;
//				
//		for(Response response: responses) {
//			if(response.getAnswer().equals(questions.get(i).getAnswer())) {
//					correct += 1;
//			}
//			i += 1;
//		}
		
		return new ResponseEntity<>(correct, HttpStatus.OK);
		
	}
}
