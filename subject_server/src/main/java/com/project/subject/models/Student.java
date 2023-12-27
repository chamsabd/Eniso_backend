package com.project.subject.models;


import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;
@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor    
@DiscriminatorValue("ROLE_STUDENT")
public class Student  extends User{
  @JsonIgnore  
  @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "matiere_student", 
      inverseJoinColumns = @JoinColumn(name = "matiere_id", referencedColumnName = "id"), 
      joinColumns = @JoinColumn(name = "student_id", 
      referencedColumnName = "id"))
    private Set<Matiere> matieres;
@JsonIgnore
@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private Set<StudentCompteRendu> studentcompterendu = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private Set<StudentNiveau> student_niveau = new HashSet<>();


    public Student(Long id, String avatar, int ncin, String nom, String prenom, String email, String password) {
      super(id, avatar, ncin, nom, prenom, email, password);
    }




    
}
