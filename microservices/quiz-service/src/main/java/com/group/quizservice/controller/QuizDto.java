package com.group.quizservice.controller;

import lombok.Data;

@Data
public class QuizDto {
	String categoryName;
	Integer numQuestions;
	String title;
}
