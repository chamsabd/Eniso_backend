package com.project.subject.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@DiscriminatorValue("ROLE_PROF")
public class Prof extends User {
   
 @OneToMany(mappedBy = "prof")
   private Set<Matiere> matieres;

   @ManyToOne
    @JoinColumn(name="departement_id")
   private Departement departement;
}
