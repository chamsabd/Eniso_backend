package com.project.subject.models;



import org.apache.tomcat.jni.Library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;

@Entity
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long code;
	@NotNull(message="name  cannot be null")
	String nom;
	double credit ;
	double VH ;
	@ManyToOne
    @JoinColumn(name="module_id")
	@NotNull(message="please select the model name")
	Module module;
	String departement;

	
	
}
