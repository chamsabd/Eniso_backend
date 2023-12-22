package com.project.subject.models;


import java.util.HashSet;
import java.util.Set;

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
     @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "matiere_student", 
      inverseJoinColumns = @JoinColumn(name = "matiere_id", referencedColumnName = "id"), 
      joinColumns = @JoinColumn(name = "student_id", 
      referencedColumnName = "id"))
    private Set<Matiere> matieres;

@OneToMany(mappedBy = "student")
    private Set<StudentCompteRendu> studentcompterendu = new HashSet<>();


    @OneToMany(mappedBy = "student")
    private Set<StudentNiveau> student_niveau = new HashSet<>();
}
