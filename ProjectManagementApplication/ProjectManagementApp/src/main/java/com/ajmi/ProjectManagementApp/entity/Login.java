package com.ajmi.ProjectManagementApp.entity;

import java.util.Set;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="LOGIN")
public class Login {

	@Id //to define an identifier
	@Column(name = "login_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer loginId;
	
	@OneToMany(mappedBy="personId")
    private Set<PersonRegistration> persons;
	
//	private Integer personId; //foreign key
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(name = "password",nullable = false)
	private String password;
	@Column(name = "full_name",nullable = false)
	private String fullName;
	@Column(name = "user_type",nullable = false)
	private String userType;
	
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public Set<PersonRegistration> getPersons() {
		return persons;
	}
	public void setPersons(Set<PersonRegistration> persons) {
		this.persons = persons;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Login() {
		
	}
	public Login(Integer loginId, Set<PersonRegistration> persons, String userName, String password, String fullName,
			String userType) {
		super();
		this.loginId = loginId;
		this.persons = persons;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.userType = userType;
	}

	
	
	
	
}
