package com.project.subject.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ROLE_ADMIN")
public class Admin extends User {
    
}
