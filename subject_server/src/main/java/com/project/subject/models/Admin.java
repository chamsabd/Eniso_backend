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
   
  private Long matricule;
}
