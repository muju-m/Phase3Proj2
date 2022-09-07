package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int S_No;
	private String name;
	private String email;
	private String feedback;
	

}
