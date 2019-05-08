package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.Developer;

public interface DeveloperRepository extends JpaRepository<Developer,Long>{
	Developer findBydeveloperId(Long id);
}
