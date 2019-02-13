package com.contact.services;

import java.io.Serializable;
import java.util.List;

import com.contact.model.Address;
import com.contact.model.Communication;
import com.contact.model.Identification;

public class ResponseMapper implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Identification identification;
	private List<Communication> communication;
	private List<Address> address;
	public Identification getIdentification() {
		return identification;
	}
	public void setIdentification(Identification identification) {
		this.identification = identification;
	}
	public List<Communication> getCommunication() {
		return communication;
	}
	public void setCommunication(List<Communication> communication) {
		this.communication = communication;
	}
	public List<Address> getAddresses() {
		return address;
	}
	public void setAddresses(List<Address> addresses) {
		this.address = addresses;
	}
	
	
}
