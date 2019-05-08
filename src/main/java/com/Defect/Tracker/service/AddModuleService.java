package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddModule;


public interface AddModuleService {
	void saveModule(AddModule addmodule);
	
	List<AddModule>getAllModules();
	AddModule  findBymoduleId(Long id);
	void updateAddModule(AddModule addModule);
	void deleteModuleById(Long id);

}
