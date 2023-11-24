package com.project.subject.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity

	  
@DiscriminatorValue("ROLE_STUDENT")
public class Student  extends User{
    
}
