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
public class Support {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;

@ManyToOne
    @JoinColumn(name="matiere_id")
    private Matiere matiere;

String path;
String nom;
Date dateajout;
}
