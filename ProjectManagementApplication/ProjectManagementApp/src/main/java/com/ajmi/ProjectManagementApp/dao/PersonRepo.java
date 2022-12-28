package com.ajmi.ProjectManagementApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajmi.ProjectManagementApp.entity.PersonRegistration;

public interface PersonRepo  extends JpaRepository<PersonRegistration, Integer>{

}
