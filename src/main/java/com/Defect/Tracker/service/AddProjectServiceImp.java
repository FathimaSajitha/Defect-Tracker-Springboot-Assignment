package com.Defect.Tracker.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddProject;

import com.Defect.Tracker.repository.AddProjectRepository;

@Service
public class AddProjectServiceImp implements AddProjectService {

	@Autowired
	AddProjectRepository addProjectRepository;
	
	
	@Override
	public void saveProject(AddProject addProject) {	
		addProjectRepository.save(addProject);
	}


	@Override
	public List<AddProject> getAllProject() {
		return addProjectRepository.findAll();
	}


	@Override
	public AddProject findByprojectId(Long projectId) {
		return addProjectRepository.findByprojectId(projectId);
	}


	@Override
	public void updateAddProject(AddProject addProject) {
		addProjectRepository.save(addProject);
	}


	@Override
	public void deleteProjectById(Long Id) {
		addProjectRepository.deleteById(Id);
		
	}


	


}
