package com.Defect.Tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Defect.Tracker.entities.AddUsers;
import com.Defect.Tracker.service.AddUsersService;

@RestController
public class AddUsersController {

	@Autowired
	public AddUsersService addUsersService;
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveusers")
	public HttpStatus createproject(@Valid @RequestBody AddUsers addUsers) {
		addUsersService.saveUsers(addUsers);
		return HttpStatus.CREATED;
	}
	@GetMapping("/getAllUsers")
	@CrossOrigin("http://localhost:3000")
	public List<AddUsers> getAllUsers(){
		return addUsersService.getAllUsers();
	}
	@GetMapping("/getAllUsersById/{id}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddUsers> getAllUsersById (@PathVariable("id") Long id){
	return new ResponseEntity<AddUsers>(addUsersService.findByuserId(id),HttpStatus.OK);
    }
	
	@PutMapping("/updateAddUsers")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddUsers>updateAddUsers(@Valid @RequestBody AddUsers addUsers){
		addUsersService.updateAddUsers(addUsers);
		return new ResponseEntity<AddUsers>(addUsers,HttpStatus.NO_CONTENT);
	}
	@DeleteMapping("/deleteUser/{userId}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddUsers>deleteUser(@PathVariable("userId") Long userId){
		addUsersService.deleteUserById(userId);
		return new ResponseEntity<AddUsers>(HttpStatus.NO_CONTENT);
	}
	
}
