package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddUsers;
import com.Defect.Tracker.repository.AddUsersRepository;

@Service
public class AddUsersServiceImpl  implements AddUsersService{


	@Autowired
	AddUsersRepository addUsersRepository;
	
	@Override
	public void saveUsers(AddUsers addUsers) {
		addUsersRepository.save(addUsers);
		
	}

	@Override
	public List<AddUsers> getAllUsers() {
		return addUsersRepository.findAll();
	}

	@Override
	public AddUsers findByuserId(Long id) {
	return addUsersRepository.findByuserId(id);
	}

	@Override
	public void updateAddUsers(AddUsers addUsers) {
		addUsersRepository.save(addUsers);
	}

	@Override
	public void deleteUserById(Long addUsers) {
		addUsersRepository.deleteById(addUsers);
	}

}
