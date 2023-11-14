package com.project.subject.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long code;
	@NotNull(message="name  cannot be null")
	String nom;
	
	double credit ;
	double VH ;
	@NotNull(message="please select the model name")
	Long UE_id;
	
	
	
}
