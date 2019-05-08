package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddProject;




public interface AddProjectService {

	void saveProject(AddProject addProject);
	List<AddProject> getAllProject();
	AddProject  findByprojectId(Long projectId);
	void updateAddProject(AddProject addProject);
	void deleteProjectById(Long Id);
	
	
}
