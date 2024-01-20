package com.group.questionservice.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.group.questionservice.Question;
import com.group.questionservice.dao.QuestionDao;

@Service
public class QuestionService {
	
	public QuestionDao questionDao;

	public QuestionService(QuestionDao questionDao) {
		super();
		this.questionDao = questionDao;
	}

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(questionDao.findAll(), HttpStatus.BAD_REQUEST);
		
	}

	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addQuestion(Question question) {
		// TODO Auto-generated method stub
		try {
			questionDao.save(question);
			return new ResponseEntity<>("success", HttpStatus.CREATED);
		} catch(Exception e) {
			e.printStackTrace();
		}
		questionDao.save(question);
		return new ResponseEntity<>("success", HttpStatus.BAD_REQUEST);
	}
	
}
