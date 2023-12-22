package com.project.subject.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor  
@Entity
@DiscriminatorValue("ROLE_ADMIN")
public class Admin extends User {
      @Id
  private Long matricule;
}
