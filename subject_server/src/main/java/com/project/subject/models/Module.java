package com.project.subject.models;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Module implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
	@NotNull(message="name  cannot be null")
	String nom;
	 @OneToMany(mappedBy = "module", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	  Set<Matiere> matieres;
	 
	@Override
	public String toString() {
		return "UE [id=" + id + ", nom=" + nom + ", subjects=" + matieres + "]";
	}
	public Module(@NotNull(message = "name  cannot be null") String nom) {
		super();
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<Matiere> getSubjects() {
		return matieres;
	}
	public void setSubjects(Set<Matiere> subjects) {
		this.matieres = subjects;
	}




}
