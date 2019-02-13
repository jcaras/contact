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


import com.contact.model.Address;
import com.contact.services.AddressDao;

@RestController
@RequestMapping(path="/address")
public class AddressController {
	
	@Autowired
	private AddressDao addressDao;

	@GetMapping(path="/", produces="application/json")
	public List<Address> getAllAddresses(){
		return (List <Address>) this.addressDao.findAll();
	}
	
	@GetMapping(path="/view", produces="application/json")
	public Address getAddressById(@RequestParam(name="id") Long id){
		return this.addressDao.findById(id);
	}
	
	@PostMapping(path="/add", produces="application/json")
	public Address saveAddress(@RequestBody Address address) {
		return this.addressDao.save(address);
	}
	
	@PutMapping(path="/update", produces="application/json")
	public Address updateAddress(@RequestBody Address address, @RequestParam long id) {
		Address addressFound = this.addressDao.findById(id);
		addressFound.loadValue(address);
		return this.addressDao.save(addressFound);
	}
	
	@DeleteMapping(path="/delete", produces="application/json")
	public String deleteAddress(@RequestParam(name="id") long id) {
		this.addressDao.delete(id);
		return "Deleted";
	}
}
