package com.project.subject.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.*;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@Entity
public class Niveau {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
   String niveau; 
@ManyToOne
    @JoinColumn(name="departement_id")
   private Departement departement;
   @OneToMany(mappedBy = "niveau")
    private  Set<StudentNiveau> studentniveau ;
    @OneToMany(mappedBy = "niveau")
    private Set<Module> modules;

}
