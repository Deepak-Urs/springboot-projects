package com.group.questionservice.service;

import java.util.List;

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

	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		return questionDao.findByCategory(category);
	}
	
}
