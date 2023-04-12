package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class HomeDTO implements Serializable{

	private int surveyNo;
	private String location;
	
	public HomeDTO(int serNo, String location) {
		super();
		this.surveyNo = serNo;
		this.location = location;
	}
     
	@Override
	public String toString() {
		return "HomeDTO [surveyNo=" + surveyNo + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, surveyNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeDTO other = (HomeDTO) obj;
		return Objects.equals(location, other.location) && surveyNo == other.surveyNo;
	}

	public int getSurveyNo() {
		return surveyNo;
	}

	public void setSurveyNo(int surveyNo) {
		this.surveyNo = surveyNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
	
	
}
