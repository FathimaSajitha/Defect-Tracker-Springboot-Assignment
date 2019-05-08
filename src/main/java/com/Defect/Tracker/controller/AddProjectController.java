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

import com.Defect.Tracker.entities.AddProject;
import com.Defect.Tracker.service.AddProjectService;

@CrossOrigin("http://localhost:3001")

	@RestController
	public class AddProjectController {
	
		
	@Autowired
	public AddProjectService addProjectService;

		@CrossOrigin("http://localhost:3000")
		@PostMapping("/saveproject")
		public HttpStatus createproject(@Valid @RequestBody AddProject addProject) {
		addProjectService. saveProject(addProject);
		return HttpStatus.CREATED;
		
		}
		@CrossOrigin("http://localhost:3000")
		@GetMapping("/getAllProject")
		public List<AddProject> getAllProject(){
			return addProjectService.getAllProject();
		}
		
		@CrossOrigin("http://localhost:3000")
		@GetMapping("/getAllProjectById/{id}")
		public ResponseEntity<AddProject> getAllProjectById (@PathVariable("id") Long id){
		return new ResponseEntity<AddProject>(addProjectService.findByprojectId(id),HttpStatus.OK);
		}
		
		@CrossOrigin("http://localhost:3000")
		@PutMapping("/updateAddProject")
		public ResponseEntity<AddProject>updateAddProject(@Valid @RequestBody AddProject addProject){
			addProjectService.updateAddProject(addProject);
			return new ResponseEntity<AddProject>(addProject,HttpStatus.NO_CONTENT);
		}
		
		@CrossOrigin("http://localhost:3000")
		@DeleteMapping("/deleteProject/{id}")
		public ResponseEntity<AddProject>deleteProject( @PathVariable("id") Long id){
			addProjectService.deleteProjectById(id);
			return new ResponseEntity<AddProject>(HttpStatus.NO_CONTENT);
		}
}