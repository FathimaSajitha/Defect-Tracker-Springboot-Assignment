package com.Defect.Tracker.service;

import java.util.List;


import com.Defect.Tracker.entities.AddUsers;

public interface AddUsersService {
	void saveUsers(AddUsers addUsers);
	List<AddUsers> getAllUsers();
	AddUsers  findByuserId(Long userId);
	void updateAddUsers(AddUsers addUsers);
	void deleteUserById(Long addUsers);

}
