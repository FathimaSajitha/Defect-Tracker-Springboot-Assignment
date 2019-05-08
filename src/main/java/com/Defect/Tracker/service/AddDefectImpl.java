package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddDefect;
import com.Defect.Tracker.repository.AddDefectRepository;

@Service
public class AddDefectImpl implements AddDefectService {

	@Autowired
	public AddDefectRepository addDefectRepository;

	@Override
	public void saveDefect(AddDefect addDefect) {
		addDefectRepository.save(addDefect);
		
	}

	@Override
	public List<AddDefect> getAllDefects() {
		return addDefectRepository.findAll();
	}

	@Override
	public AddDefect findBydefectId(Long id) {
		// TODO Auto-generated method stub
		return addDefectRepository.findBydefectId(id);
	}

	@Override
	public void updateAddDefect(AddDefect addDefect) {
		addDefectRepository.save(addDefect);
	}

	@Override
	public void deleteDefectById(Long id) {
//		addDefectRepository.deleteById(id);
		}
	

	
}
