package com.example.lombokdemo;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;

//@Setter
//@Getter
//@AllArgsConstructor
//@EqualsAndHashCode
//@Data <- Superset of above four annotations

@Data
public class Student {
	private long id;
	private String firstName;
	private String lastName;
}
