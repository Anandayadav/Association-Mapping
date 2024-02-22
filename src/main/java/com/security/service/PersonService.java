package com.security.service;

import org.springframework.stereotype.Repository;

import com.security.enity.Passport;
import com.security.enity.Person;


public interface PersonService {

	public void savePerson();
	public void DeletePerson();
	public void getRecordByperson();
	public Void getRecordByPassport();
	
}
