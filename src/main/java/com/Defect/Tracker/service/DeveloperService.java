package com.Defect.Tracker.service;


import java.util.List;

import com.Defect.Tracker.entities.Developer;

public interface DeveloperService {
	void saveDeveloper(Developer developer);
	List<Developer> getAllDeveloper();
	Developer findBydeveloperId(Long developerId);
	void updateDeveloper(Developer developer);
	void deleteDeveloperById(Long developer);
}
