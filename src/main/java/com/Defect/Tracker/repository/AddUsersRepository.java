package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.AddUsers;

public interface AddUsersRepository  extends JpaRepository<AddUsers,Long> {
	AddUsers findByuserId(Long id);
}
