package com.project.subject.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity

	  
@DiscriminatorValue("ROLE_PROF")
public class Prof extends User {
 @OneToMany(mappedBy = "prof")
   private Set<Matiere> matieres;
}
