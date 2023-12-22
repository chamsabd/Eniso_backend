package com.project.subject.models;



import java.util.Set;

import org.apache.tomcat.jni.Library;


import jakarta.persistence.Entity;
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
	@ManyToOne
    @JoinColumn(name="module_id")
	@NotNull(message="please select the model name")
	Module module;
	

	@ManyToOne
    @JoinColumn(name="prof_id")
    private User prof;
@ManyToMany(mappedBy = "matieres")
    private Set<Student> students;
	@OneToMany(mappedBy = "matiere")
    private Set<Support> supports;

	@OneToMany(mappedBy = "matiere")
    private Set<CompteRendu> compterendus;
}
