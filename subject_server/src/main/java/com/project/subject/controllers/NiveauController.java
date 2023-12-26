package com.project.subject.controllers;



import java.lang.module.ResolutionException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.subject.models.Niveau;

import com.project.subject.services.NiveauService;
 /**
  * InnerNiveauController
  */

@RestController
@RequestMapping("/niveaux")
public class NiveauController {
    @Autowired
	private NiveauService nrepo;
	 @GetMapping("/")
    public ResponseEntity<?> GetNiveaus(){
        List<Niveau> ms=nrepo.getNiveaus();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



     @GetMapping("/{id}")
    public ResponseEntity<?> GetNiveau(@PathVariable Long id){
        Niveau ms=nrepo.getNiveau(id).get();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



@DeleteMapping("/{id}")
		public void deleteNiveau(@PathVariable Long id)
	{
				nrepo.deleteNiveau(id);
	}
	@PostMapping
	public ResponseEntity<?> saveNiveau(@RequestBody Niveau n) {
		nrepo.saveNiveau(n);
		return new ResponseEntity<>(n,HttpStatus.OK);
	}




	@PutMapping("/{id}")
    public ResponseEntity<?> updateNiveau(@PathVariable Long id, @RequestBody Niveau n) 
	{
		Niveau ne = nrepo.getNiveau(id).get();
			if (ne != null)
			{
				ne.setId(id);
                ne.setNiveau(n.getNiveau());
				ne.setDepartement(n.getDepartement());
				
                
				nrepo.saveNiveau(ne);
				return new ResponseEntity<>(ne, HttpStatus.OK);
				
			}
					else 
						throw  new NoSuchElementException();
	
	}

}
