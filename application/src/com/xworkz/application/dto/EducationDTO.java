package com.xworkz.application.dto;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO implements Serializable{
	
	private int id;
	private String degreeName;
	private int percentage;
	private String univercity;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlog;
	private String streem;
	private String candidateName;
	
	public EducationDTO(int id, String degreeName, int percentage, String univercity, LocalDate startDate,
			LocalDate endDate, int backlog, String streem, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.univercity = univercity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.streem = streem;
		this.candidateName = candidateName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getUnivercity() {
		return univercity;
	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getBacklog() {
		return backlog;
	}

	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}

	public String getStreem() {
		return streem;
	}

	public void setStreem(String streem) {
		this.streem = streem;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", univercity="
				+ univercity + ", startDate=" + startDate + ", endDate=" + endDate + ", backlog=" + backlog
				+ ", streem=" + streem + ", candidateName=" + candidateName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, candidateName, degreeName, endDate, id, percentage, startDate, streem, univercity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDTO other = (EducationDTO) obj;
		return backlog == other.backlog && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(degreeName, other.degreeName) && Objects.equals(endDate, other.endDate)
				&& id == other.id && percentage == other.percentage && Objects.equals(startDate, other.startDate)
				&& Objects.equals(streem, other.streem) && Objects.equals(univercity, other.univercity);
	}
	
	
}
