package com.project.subject.models;



import java.io.Serializable;
import java.util.Set;

import org.apache.tomcat.jni.Library;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.*;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@NoArgsConstructor
@AllArgsConstructor  
@Entity



public class Matiere implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
	@NotNull(message="name  cannot be null")
	String nom;
	double credit ;
	double VH ;
	

	
  @ManyToOne()
    @JoinColumn(name="module_id")
	@JsonBackReference
	Module module;
	

	 @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="prof_id")
    private Prof prof;
	
	 @ManyToMany(mappedBy = "matieres",cascade = CascadeType.ALL)
    private Set<Student> students;
	
	@JsonIgnore @OneToMany(mappedBy = "matiere",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Support> supports;

	@JsonIgnore @OneToMany(mappedBy = "matiere",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CompteRendu> compterendus;

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

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getVH() {
		return VH;
	}

	public void setVH(double vH) {
		VH = vH;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Support> getSupports() {
		return supports;
	}

	public void setSupports(Set<Support> supports) {
		this.supports = supports;
	}

	public Set<CompteRendu> getCompterendus() {
		return compterendus;
	}

	public void setCompterendus(Set<CompteRendu> compterendus) {
		this.compterendus = compterendus;
	}

	



	
}
