package com.project.subject.models;

import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.*;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@Entity
public class StudentNiveau {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;

  @ManyToOne
    @JoinColumn(name = "student_id")
    @Where(clause = "role='ROLE_STUDENT'")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "niveau_id")
    private Niveau niveau;


     String annees;
     String etat;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Niveau getNiveau() {
        return niveau;
    }
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
    public String getAnnees() {
        return annees;
    }
    public void setAnnees(String annees) {
        this.annees = annees;
    }
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }


     
}
