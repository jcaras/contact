package com.contact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="communication")
public class Communication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JoinColumn(name = "identificationid", referencedColumnName = "id", insertable = false, updatable = false)
	private long identificationid;
	
	private String type;
	
	private String value;
	
	private String preferred;

	
	public Communication() {
		super();
	}


	public Communication(long id, long identificationid, String type, String value, String preferred) {
		super();
		this.id = id;
		this.identificationid = identificationid;
		this.type = type;
		this.value = value;
		this.preferred = preferred;
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


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getPreferred() {
		return preferred;
	}


	public void setPreferred(String preferred) {
		this.preferred = preferred;
	}


	@Override
	public String toString() {
		return "Communication [id=" + id + ", identificationid=" + identificationid + ", type=" + type + ", value="
				+ value + ", preferred=" + preferred + "]";
	}
	
	public void loadValue(Communication communication) {
		this.identificationid = communication.getIdentificationid();
		this.type = communication.getType();
		this.value = communication.getValue();
		this.preferred = communication.getPreferred();
	}
	
}
