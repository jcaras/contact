package com.contact.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.contact.model.Address;

@Transactional
public interface AddressDao extends CrudRepository<Address, Long> {

	public Address findById(long id);
	
	@Query(value="SELECT a from Address a WHERE a.identificationid = :identificationid ")
	public List<Address> findAddressByIdentification(@Param("identificationid") Long identificationid);
}
