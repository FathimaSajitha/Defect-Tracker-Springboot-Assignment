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

import com.Defect.Tracker.entities.Developer;
import com.Defect.Tracker.service.DeveloperService;

@RestController
public class DeveloperController {

	@Autowired
	public DeveloperService developerService;
	
	@PostMapping("/saveDeveloper")
	@CrossOrigin("http://localhost:3000")
	public HttpStatus createdeveloper(@Valid @RequestBody Developer developer) {
		developerService.saveDeveloper(developer);
		return HttpStatus.CREATED;
		
	}
	@GetMapping("/getAllDeveloper")
	@CrossOrigin("http://localhost:3000")
	public List<Developer> getAllDeveloper(){
		return developerService.getAllDeveloper();
	}
	
	@GetMapping("/getAllDeveloperById/{id}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<Developer> getAllDeveloperById (@PathVariable("id") Long id){
	return new ResponseEntity<Developer>(developerService.findBydeveloperId(id),HttpStatus.OK);
    }
	
	@PutMapping("/updateDeveloper")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<Developer>updateDeveloper(@Valid @RequestBody Developer developer){
		developerService.updateDeveloper(developer);
		return new ResponseEntity<Developer>(developer,HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/deleteDeveloper/{developerId}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<Developer>deleteDeveloper(@PathVariable("developerId") Long developerId){
		developerService.deleteDeveloperById(developerId);
		return new ResponseEntity<Developer>(HttpStatus.NO_CONTENT);
	}
}
