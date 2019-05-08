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

import com.Defect.Tracker.entities.AddModule;
import com.Defect.Tracker.service.AddModuleService;

@RestController
public class AddModuleController {
	
	@Autowired
	private AddModuleService  addModuleService;
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/addmodule")
	public HttpStatus createmodule(@Valid @RequestBody AddModule addmodule) {
		addModuleService.saveModule(addmodule);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllmodules")
	@CrossOrigin("http://localhost:3000")
	public List<AddModule> getAllModules(){
		return addModuleService.getAllModules();
	}
	
	@GetMapping("/getAllModulesById/{id}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddModule> getAllModulesById (@PathVariable("id") Long id){
	return new ResponseEntity<AddModule>(addModuleService.findBymoduleId(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateAddModule")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddModule>updateAddModule(@Valid @RequestBody AddModule addModule){
		addModuleService.updateAddModule(addModule);
		return new ResponseEntity<AddModule>(addModule,HttpStatus.NO_CONTENT);
	}
	@DeleteMapping("/deleteModule/{moduleId}")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<AddModule>deleteModule(@PathVariable("moduleId") Long moduleId){
		addModuleService.deleteModuleById(moduleId);
		return new ResponseEntity<AddModule>(HttpStatus.NO_CONTENT);
	}
	
}

