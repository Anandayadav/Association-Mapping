package com.security.enity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	private String passpotNum;
	private String center;
	private LocalDate startDate;
	private  LocalDate endDate;

	@OneToOne
	@JoinColumn(name="person-id")
	private Person person;

	public String getPasspotNum() {
		return passpotNum;
	}

	public void setPasspotNum(String passpotNum) {
		this.passpotNum = passpotNum;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	
	
}
