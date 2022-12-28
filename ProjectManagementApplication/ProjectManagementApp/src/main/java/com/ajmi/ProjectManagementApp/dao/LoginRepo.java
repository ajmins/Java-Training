package com.ajmi.ProjectManagementApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajmi.ProjectManagementApp.entity.Login;

public interface LoginRepo  extends JpaRepository<Login, Integer> {

}
