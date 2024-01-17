package com.project.subject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.subject.models.Matiere;
import com.project.subject.services.MatiereService;

@SpringBootTest
class SubjectServerApplicationTests {
 @Autowired
	private MatiereService mrepo;
	@Test
	void contextLoads() {
		 List<Matiere> ms=mrepo.getMatieres(1L,1L);
	for (Matiere matiere : ms) {
		System.out.println(matiere.getNom().toString());
		
	}
	
		}

}
