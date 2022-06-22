package com.ajunior.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajunior.security.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
}