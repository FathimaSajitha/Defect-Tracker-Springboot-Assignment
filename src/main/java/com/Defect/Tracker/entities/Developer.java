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
@Table(name="Developer")
public class Developer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="developer_id")
	private Long developerId;
	
	@Column(name="developer_name")
	private String developerName;
	
	public Long getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(Long developerId) {
		this.developerId = developerId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	
	//created relationship with module
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="developer",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<AddModule> addModule;

	public List<AddModule> getAddModule() {
		return addModule;
	}
	public void setAddModule(List<AddModule> addModule) {
		this.addModule = addModule;
	}
	
	
	
	
	

}
