package com.Defect.Tracker.entities;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Add_Defect")

public class AddDefect {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	@Column(name="defect_id")
	private Long defectId;
	
	@Column(name="defect_type")
	private String defecttype;
	
	@Column(name="defect_description")
	private String defectdescription;
	
	@Column(name="severity")
	private String severity;
	
	@Column(name="Piriority")
	private String piriority;
	
	@Column(name="status")
	private String status;
	
	@Column(name="assigned_person")
	private String assignedperson;
	
	@Column(name="enterd_date")
	private String enterddate;
	
	@Column(name="entered_by")
	private String enteredby;
	
	@Column(name="fixed_date")
	private String fixeddate;
	
	@Column(name="fixed_by")
	private String fixedby;
	
	@Column(name="available_in")
	private String availablein;
	
	@Column(name="comments")
	private String comments;


	// create relationship with module
	@ManyToOne
	@JoinColumn(name="module_id",nullable=false)
	private AddModule addModule;
			
		public AddModule getAddModule() {
				return addModule;
		}

		public void setAddModule(AddModule addModule) {
				this.addModule = addModule;
		}	
	


		
	public Long getDefectId() {
		return defectId;
	}

	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}

	public String getDefecttype() {
			return defecttype;
	}

	public void setDefecttype(String defecttype) {
			this.defecttype = defecttype;
	}

	public String getDefectdescription() {
			return defectdescription;
	}

	public void setDefectdescription(String defectdescription) {
			this.defectdescription = defectdescription;
	}

	public String getSeverity() {
			return severity;
	}

	public void setSeverity(String severity) {
			this.severity = severity;
	}

	public String getPiriority() {
			return piriority;
	}
	
	public void setPiriority(String piriority) {
			this.piriority = piriority;
	}

	public String getStatus() {
			return status;
	}

	public void setStatus(String status) {
			this.status = status;
	}

	public String getAssignedperson() {
			return assignedperson;
	}

	public void setAssignedperson(String assignedperson) {
			this.assignedperson = assignedperson;
	}

	public String getEnterddate() {
			return enterddate;
	}

	public void setEnterddate(String enterddate) {
			this.enterddate = enterddate;
	}

	public String getEnteredby() {
			return enteredby;
	}

	public void setEnteredby(String enteredby) {
			this.enteredby = enteredby;
	}
	
	public String getFixeddate() {
			return fixeddate;
	}

	public void setFixeddate(String fixeddate) {
			this.fixeddate = fixeddate;
	}

	public String getFixedby() {
			return fixedby;
	}


	public void setFixedby(String fixedby) {
			this.fixedby = fixedby;
	}

	public String getAvailablein() {
			return availablein;
	}

	public void setAvailablein(String availablein) {
			this.availablein = availablein;
	}

	public String getComments() {
			return comments;
	}

	public void setComments(String comments) {
			this.comments = comments;
	}
	

	
	
}
