package com.project.subject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Niveau {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
   String niveau; 
}
