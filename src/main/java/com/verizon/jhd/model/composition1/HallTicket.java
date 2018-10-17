package com.verizon.jhd.model.composition1;

import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="halltickets")
public class HallTicket {

	@Id
	private String halltiketNumber;
	private String candidateName;
	private String examtitle;
	@Embedded
	private Identification identity;
	
	
	public HallTicket() {
	}
	public HallTicket(String halltiketNumber, String candidateName, String examtitle, Identification identity) {
		this.halltiketNumber = halltiketNumber;
		this.candidateName = candidateName;
		this.examtitle = examtitle;
		this.identity = identity;
	}
	public String getHalltiketNumber() {
		return halltiketNumber;
	}
	public void setHalltiketNumber(String halltiketNumber) {
		this.halltiketNumber = halltiketNumber;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getExamtitle() {
		return examtitle;
	}
	public void setExamtitle(String examtitle) {
		this.examtitle = examtitle;
	}
	public Identification getIdentity() {
		return identity;
	}
	public void setIdentity(Identification identity) {
		this.identity = identity;
	}
	
	
}
