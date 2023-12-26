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

import com.project.subject.models.Departement;

import com.project.subject.services.DepartementService;
 /**
  * InnerDepartementController
  */

@RestController
@RequestMapping("/departement")
public class DepartementController {
    @Autowired
	private DepartementService nrepo;
	 @GetMapping("/")
    public ResponseEntity<?> GetDepartements(){
        List<Departement> ms=nrepo.getDepartements();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



     @GetMapping("/{id}")
    public ResponseEntity<?> GetDepartement(@PathVariable Long id){
        Departement ms=nrepo.getDepartement(id).get();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



@DeleteMapping("/{id}")
		public void deleteDepartement(@PathVariable Long id)
	{
				nrepo.deleteDepartement(id);
	}
	@PostMapping
	public ResponseEntity<?> saveDepartement(@RequestBody Departement n) {
		nrepo.saveDepartement(n);
		return new ResponseEntity<>(n,HttpStatus.OK);
	}




	@PutMapping("/{id}")
    public ResponseEntity<?> updateDepartement(@PathVariable Long id, @RequestBody Departement n) 
	{
		Departement ne = nrepo.getDepartement(id).get();
			if (ne != null)
			{
				ne.setId(id);
                ne.setTitre(n.getTitre());
				
			
                
				nrepo.saveDepartement(ne);
				return new ResponseEntity<>(ne, HttpStatus.OK);
				
			}
					else 
						throw  new NoSuchElementException();
	
	}

}
