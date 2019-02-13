package com.contact.services;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.contact.model.Identification;

@Transactional
public interface IdentificationDao extends CrudRepository<Identification, Long> {

	public Identification findById(long id);
	
	//@Query(value="Select i from Identification i ORDER BY :sortby :arrange")
	//public List<Identification> sortBy(@Param("sortby") String sortby, @Param("arrange") String arrange);
}
