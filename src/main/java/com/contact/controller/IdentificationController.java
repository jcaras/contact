package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Identification;
import com.contact.services.IdentificationDao;

@RestController
@RequestMapping(path="/identification")
public class IdentificationController {

	@Autowired
	private IdentificationDao identificationDao;
	
	@GetMapping(path="/identity", produces="application/json")
	public Identification getIndenficationById(@RequestParam(name="id") long id){
		return this.identificationDao.findById(id);
	}
	
	@GetMapping(path="/", produces="application/json")
	public List<Identification> getAllIndenfication(){
		return (List <Identification>) this.identificationDao.findAll();
	}
	
	@PostMapping(path="/add", produces="application/json")
	public String[] addIndentification(@RequestBody Identification identification) {
		String msg = "Saved";
		
		if(this.identificationDao.save(identification) == null) {
			msg = "Not Saved";
		}
		
		return new String[] {msg};
	}
	
	@PutMapping(path="/update", produces="application/json")
	public String[] updateIdentification(@RequestBody Identification identification, long id) {
		Identification identityfound = this.identificationDao.findOne(id);
		
		identityfound.loadValue(identification);
		
		return new String[] { this.identificationDao.save(identityfound) == null ? "Not saved: " + identification.toString(): "Saved"};
	}
	
	@DeleteMapping(path="/delete", produces="application/json")
	public String[] deleteIdentification(@RequestParam(name="id") long id) {
		identificationDao.delete(id);
		return new String[] {"Deleted: "};
	}
}
