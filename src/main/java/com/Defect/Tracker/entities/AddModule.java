package com.Defect.Tracker.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="add_modules")
public class AddModule {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="module_id")
	private Long moduleId;
	
	@Column(name="module_name")
	private String modulename;
	
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	
	

	//created relationship with developer
	@ManyToOne
	@JoinColumn(name="developerId",nullable=false)
	private Developer developer;
	
	// getters and setters for developer
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	
	//created relationship with project
	@ManyToOne
	@JoinColumn(name="projectId",nullable=false)
	private AddProject addProject;
	
	public AddProject getAddProject() {
		return addProject;
	}
	public void setAddProject(AddProject addProject) {
		this.addProject = addProject;
	}
	
	// create relationship with defect
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="addModule",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List <AddDefect> addDefect;

	public List<AddDefect> getAddDefect() {
		return addDefect;
	}
	public void setAddDefect(List<AddDefect> addDefect) {
		this.addDefect = addDefect;
	}
							
	
	
}
