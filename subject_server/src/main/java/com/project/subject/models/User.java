package com.project.subject.models;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role", 
  discriminatorType = DiscriminatorType.STRING)
public class User {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;


    String avatar;
   
    int ncin;
  

  @NotBlank
  @Size(max = 20)
  private String nom;
  
  @NotBlank
  @Size(max = 20)
  private String prenom;
  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getAvatar() {
    return avatar;
}

public void setAvatar(String avatar) {
    this.avatar = avatar;
}

public int getNcin() {
    return ncin;
}

public void setNcin(int ncin) {
    this.ncin = ncin;
}

public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getPrenom() {
    return prenom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

}
