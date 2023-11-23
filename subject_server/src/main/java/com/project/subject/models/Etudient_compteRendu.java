package com.project.subject.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudient_compteRendu {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
    Date date_ajout;
    float note;
    String commentaire;
    String path;
    String titre;
}
