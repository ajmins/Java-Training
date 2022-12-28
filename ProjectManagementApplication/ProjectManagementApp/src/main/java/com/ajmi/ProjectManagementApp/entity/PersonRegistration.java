package com.ajmi.ProjectManagementApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PERSON_REGISTRATION")
public class PersonRegistration {

	@Id //to define an identifier
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer personId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name",nullable = false)
	private String lastName;
	@Column(name = "email_id")
	private String emailID;
	@Column(name = "phone_number")
	private int phoneNumber;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public PersonRegistration() {
		
	}
	public PersonRegistration(String firstName, String lastName, String emailID, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
