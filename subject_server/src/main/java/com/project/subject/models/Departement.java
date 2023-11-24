package com.project.subject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Departement {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
    String titre;
    
}
