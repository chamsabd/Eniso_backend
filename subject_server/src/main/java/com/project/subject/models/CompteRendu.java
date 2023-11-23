package com.project.subject.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompteRendu {
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
String title;
Date date_creation;
Date date_fermeture;

}
