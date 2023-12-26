package com.project.subject.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import lombok.*;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@Entity
public class Departement {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
    String titre;
    @OneToMany(mappedBy = "departement")
   private Set<Niveau> niveaux;
    @OneToMany(mappedBy = "departement")
   private Set<Prof> profs;
    
}
