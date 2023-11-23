package com.project.subject.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
 @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
  

  private ERole name;
@ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
  public Role() {

  }

  public Role(ERole name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}