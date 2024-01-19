package com.group.questionservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String category;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String question;
	private String answer;
	private String difficultylevel;
	
	public Question() {
		
	}

	public Question(Integer id, String category, String option1, String option2, String option3, String option4,
			String question, String answer, String difficultylevel) {
		super();
		this.id = id;
		this.category = category;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.question = question;
		this.answer = answer;
		this.difficultylevel = difficultylevel;
	}
	
	
	
	
}
