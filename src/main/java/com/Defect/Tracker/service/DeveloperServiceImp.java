package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.Developer;
import com.Defect.Tracker.repository.DeveloperRepository;

@Service
public class DeveloperServiceImp implements DeveloperService {

	@Autowired
	DeveloperRepository developerRepository;
	

	public void saveDeveloper(Developer developer) {
		developerRepository.save(developer);
		
	}


	@Override
	public List<Developer> getAllDeveloper() {
		return developerRepository.findAll();
	}


	@Override
	public Developer findBydeveloperId(Long id) {
		return developerRepository.findBydeveloperId(id);
	}


	@Override
	public void updateDeveloper(Developer developer) {
		developerRepository.save(developer);
		
	}


	@Override
	public void deleteDeveloperById(Long developer) {
		developerRepository.deleteById(developer);
		
	}

}
