package com.project.subject.models;



import java.util.Set;

import org.apache.tomcat.jni.Library;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.*;

import lombok.*;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@Entity

public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
	@NotNull(message="name  cannot be null")
	String nom;
	double credit ;
	double VH ;
	
	  @ManyToOne()
    @JoinColumn(name="module_id")
	@NotNull(message="please select the model name")
	Module module;
	

	 @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="prof_id")
    private Prof prof;
	
@JsonIgnore  @ManyToMany(mappedBy = "matieres",cascade = CascadeType.ALL)
    private Set<Student> students;
	
	@JsonIgnore  @OneToMany(mappedBy = "matiere",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Support> supports;

	@JsonIgnore @OneToMany(mappedBy = "matiere",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CompteRendu> compterendus;

	



	
}
