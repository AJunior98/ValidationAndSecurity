package com.ajunior.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajunior.security.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
	
}