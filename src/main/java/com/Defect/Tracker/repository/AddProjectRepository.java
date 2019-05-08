package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.AddProject;


public interface AddProjectRepository extends JpaRepository<AddProject, Long> {
	AddProject findByprojectId(Long id);

}
