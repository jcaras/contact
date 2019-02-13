package com.contact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="identification")
public class Identification {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String gender;
	
	private String title;
	
	private String dob;
	
	
	public Identification() {
		super();
	}



	public Identification(int id, String firstname, String lastname, String gender, String title, String dob) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.title = title;
		this.dob = dob;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Identification [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", title=" + title + ", dob=" + dob + "]";
	}
	
	public void loadValue(Identification identification) {
		this.dob = identification.getDob();
		this.firstname = identification.getFirstname();
		this.lastname = identification.getLastname();
		this.title = identification.getTitle();
		this.gender = identification.getGender();
	}
}
