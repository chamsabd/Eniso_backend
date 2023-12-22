package com.project.subject.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.tomcat.jni.Library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor  
@Entity
public class CompteRendu {
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
String title;
Date date_creation;
Date date_fermeture;
@OneToMany(mappedBy = "compterendu")
    private  Set<Student_compteRendu> StudentCompteRendu = new HashSet<>();

@ManyToOne
    @JoinColumn(name="matiere_id")
    private Matiere matiere;


}
