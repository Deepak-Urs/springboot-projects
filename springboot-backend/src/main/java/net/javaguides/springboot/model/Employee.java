package net.javaguides.springboot.model;

import jakarta.persistence.Entity;
import lombok.Data;

//@Entity -> used to convert a class to JPA entity

@Data
@Entity
public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
}
