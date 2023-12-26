package com.project.subject.models;

import java.sql.Date;

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
public class StudentCompteRendu {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
      @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "compterendu_id")
    private CompteRendu compterendu;

    Date dateajout;
    float note;
    String commentaire;
    String path;
    String titre;
}
