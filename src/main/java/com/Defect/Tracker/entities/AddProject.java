package com.Defect.Tracker.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Add_project")
public class AddProject {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Project_id")
	private Long projectId;
	
	@Column (name="project_name")
	private String projectName;
	
	//created relationship with module
		@JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
		@OneToMany(mappedBy="addProject",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		private List<AddModule> addModule;

	
		public List<AddModule> getAddModule() {
			return addModule;
		}
		public void setAddModule(List<AddModule> addModule) {
			this.addModule = addModule;
		}
		public Long getProjectId() {
			return projectId;
		}
		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
	
	

	
}
