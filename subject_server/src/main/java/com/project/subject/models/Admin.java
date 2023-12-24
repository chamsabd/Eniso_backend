package com.project.subject.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor  
@Entity
@DiscriminatorValue("ROLE_ADMIN")
public class Admin extends User {
   
  private Integer matricule;

  public Admin(Long id, String avatar, int ncin, String nom, String prenom, String email, String password,
      Integer matricule) {
    super(id, avatar, ncin, nom, prenom, email, password);
    this.matricule = matricule;
  }



  
}
