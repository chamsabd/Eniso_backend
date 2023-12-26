package com.project.subject.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
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
   
 @OneToMany(mappedBy = "prof",cascade = CascadeType.ALL)
   private Set<Matiere> matieres;

   @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="departement_id")
   private Departement departement;

  public Prof(Long id, String avatar, int ncin, String nom, String prenom, String email, String password,
      Departement departement) {
    super(id, avatar, ncin, nom, prenom, email, password);
    this.departement = departement;
  }



   
}
