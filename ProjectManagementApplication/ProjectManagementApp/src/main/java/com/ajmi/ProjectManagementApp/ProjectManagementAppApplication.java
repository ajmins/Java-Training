package com.ajmi.ProjectManagementApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajmi.ProjectManagementApp.dao.LoginRepo;
import com.ajmi.ProjectManagementApp.dao.PersonRepo;
import com.ajmi.ProjectManagementApp.entity.PersonRegistration;

@SpringBootApplication
public class ProjectManagementAppApplication implements CommandLineRunner{

	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private LoginRepo loginRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementAppApplication.class, args);
		System.out.println("Hello");
		
		
	}


	@Override
	public void run(String... args) throws Exception {
//		PersonRegistration person1 = new PersonRegistration("Javed", "Kim", "javed.b@email.com", 12345);
//		personRepo.save(person1);
		Set<Integer> personsList = new HashSet<>(); 
		LoginRepo login1 = new LoginRepo(personsList,"javedKim", "javed@123", "Javed Kim", "normaluser");
		loginRepo.save(login1);
		
	}
}
