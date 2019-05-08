package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddModule;
import com.Defect.Tracker.repository.AddModuleRepository;

@Service
public class AddModuleServiceImp implements AddModuleService  {
	
	@Autowired
	private AddModuleRepository addModuleRepository;

	@Override
	public void saveModule(AddModule addmodule) {
		addModuleRepository.save(addmodule);
		
	}

	@Override
	public List<AddModule> getAllModules() {
		return addModuleRepository.findAll();
	}

	@Override
	public AddModule findBymoduleId(Long id) {
		return addModuleRepository.findBymoduleId(id);
	}

	@Override
	public void updateAddModule(AddModule addModule) {
		addModuleRepository.save(addModule);
		
	}

	@Override
	public void deleteModuleById(Long moduleId) {
		addModuleRepository.deleteById(moduleId);
		
	}

	

	


	


}
