package com.contact.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.contact.model.Communication;

public interface CommunicationDao extends CrudRepository<Communication, Long>{

	public Communication findById(long id);
	
	@Query(value="SELECT c from Communication c WHERE c.identificationid = :identificationid ")
	public List<Communication> findCommunicationByIdentification(@Param("identificationid") Long identificationid);
	
}
