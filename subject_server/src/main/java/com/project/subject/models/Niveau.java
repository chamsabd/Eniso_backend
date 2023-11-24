package com.project.subject.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Niveau {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
   String niveau; 

   @OneToMany(mappedBy = "niveau")
    private  Set<Student_Niveau> student_niveau = new HashSet<>();

    @OneToMany(mappedBy = "niveau")
    private Set<Module> modules;

}
