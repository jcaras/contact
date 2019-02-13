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

import com.contact.model.Communication;
import com.contact.services.CommunicationDao;

@RestController
@RequestMapping(path="/communication")
public class CommunicationController {

	@Autowired
	private CommunicationDao communicationDao;
	
	@GetMapping(path="/", produces="application/json")
	public List<Communication> getAllCommunication(){
		return (List <Communication>) this.communicationDao.findAll();
	}

	@GetMapping(path="/communication", produces="application/json")
	public Communication getCommunicationById(@RequestParam(name="id") long id){
		return this.communicationDao.findById(id);
	}

	@PostMapping(path="/add", produces="application/json")
	public Communication addCommunication(@RequestBody Communication communication) {
		return this.communicationDao.save(communication);
	}
	
	@PutMapping(path="/update", produces="appication/json")
	public Communication updateCommunication(@RequestBody Communication communication, @RequestParam(name="id") long id) {
		Communication communicationFound = this.communicationDao.findById(id);
		
		communicationFound.loadValue(communication);
		
		return this.communicationDao.save(communicationFound);
	}
	

	@DeleteMapping(path="/delete", produces="application/json")
	public String[] deleteIdentification(@RequestParam(name="id") long id) {
		this.communicationDao.delete(id);
		return new String[] {"Deleted"};
	}
}
