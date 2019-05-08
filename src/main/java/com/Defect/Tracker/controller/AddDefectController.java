package com.Defect.Tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Defect.Tracker.entities.AddDefect;
import com.Defect.Tracker.service.AddDefectService;

@RestController
public class AddDefectController {

	@Autowired
	public AddDefectService AddDefectService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveDefect")

	public HttpStatus createproject(@Valid @RequestBody  AddDefect addDefect) {
		AddDefectService.saveDefect(addDefect);
		return HttpStatus.CREATED;

	}
	
	@GetMapping("/getAllDefects")
	@CrossOrigin("http://localhost:3000")
	public List<AddDefect> getAllDefects(){
		return AddDefectService.getAllDefects();
	}
	
	@GetMapping("/getAllDefectsById/{id}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity <AddDefect>getAllDefectsById(@PathVariable("id") Long id){
		return new ResponseEntity <AddDefect>(AddDefectService.findBydefectId(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateAddDefect")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddDefect>updateAddDefect(@Valid @RequestBody AddDefect addDefect){
		AddDefectService.updateAddDefect(addDefect);
		return new ResponseEntity<AddDefect>(addDefect,HttpStatus.NO_CONTENT);
	}
	
}
