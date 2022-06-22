package com.ajunior.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajunior.security.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}