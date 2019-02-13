package com.contact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long identificationid;
	
	private String type;
	
	private int number;
	
	private String street;
	
	private String unit;
	
	private String city;
	
	private String state;
	
	private String zip;

	public Address() {
		super();
	}

	public Address(long id, long identificationid, String type, int number, String street, String unit, String city,
			String state, String zip) {
		super();
		this.id = id;
		this.identificationid = identificationid;
		this.type = type;
		this.number = number;
		this.street = street;
		this.unit = unit;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdentificationid() {
		return identificationid;
	}

	public void setIdentificationid(long identificationid) {
		this.identificationid = identificationid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", identificationid=" + identificationid + ", type=" + type + ", number=" + number
				+ ", street=" + street + ", unit=" + unit + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
	
	public void loadValue(Address address) {
		this.city = address.getCity();
		this.identificationid = address.getIdentificationid();
		this.number = address.getNumber();
		this.state = address.getState();
		this.street = address.getStreet();
		this.type = address.getType();
		this.unit = address.getUnit();
		this.zip = address.getUnit();
		
	}
}
