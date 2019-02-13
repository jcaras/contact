package com.contact.controller;

import java.util.ArrayList;
import java.util.List;

import com.contact.services.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Identification;
import com.contact.services.AddressDao;
import com.contact.services.CommunicationDao;
import com.contact.services.IdentificationDao;

@RestController
@RequestMapping(path="/person")
public class PersonController {

	@Autowired
	private CommunicationDao communicationDao;
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private IdentificationDao identificationDao;
	
	@GetMapping(produces="application/json")
	public List<ResponseMapper> getAllPersons(@RequestParam(value="sortby", required=false) String sort, @RequestParam(value="orderAs", required=false) String orderAs) {
		List<Identification> identifications = (List<Identification>) this.identificationDao.findAll();
		
		if(sort!= null && sort.equalsIgnoreCase("lastname")) {
			
		//	identifications = this.identificationDao.sortBy("lastname", orderAs == "" ? "ASC" : orderAs);
		}
		
		List<ResponseMapper> persons = new ArrayList<>();
		for(Identification i: identifications) {
			ResponseMapper m = new ResponseMapper();
			m.setAddresses(this.addressDao.findAddressByIdentification(i.getId()));
			m.setCommunication(this.communicationDao.findCommunicationByIdentification(i.getId()));
			m.setIdentification(i);
			persons.add(m);
		}
		return persons;
	}
	
	@GetMapping(path="/view", produces="application/json")
	public ResponseMapper viewRecord(@RequestParam("id") long id) {
		ResponseMapper mapper = new ResponseMapper();
		mapper.setIdentification(this.identificationDao.findById(id));
		mapper.setAddresses(this.addressDao.findAddressByIdentification(mapper.getIdentification().getId()));
		mapper.setCommunication(this.communicationDao.findCommunicationByIdentification(mapper.getIdentification().getId()));
		return mapper;
	}
}
