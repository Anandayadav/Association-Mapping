package com.security.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Personrepo.Passportrepo;
import com.security.Personrepo.Personrepo;
import com.security.enity.Passport;
import com.security.enity.Person;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	private Personrepo personrepo;
	
	@Autowired
	private Passportrepo passportrepo;
	
	@Override
	public void savePerson() {
		
		Passport passport=new Passport();
		passport.setPasspotNum("45565HHG85");
		passport.setCenter("Benglore");
		passport.setStartDate(LocalDate.now());
		passport.setEndDate(LocalDate.now().plusYears(10));
	
		Person person=new Person();
		person.setName("Ajay");
		person.setEmail("Ajay123@gmail.com");
		person.setPhno((long) 745896235);
		
		passport.setPerson(person);
		person.setPassport(passport);
		
	passportrepo.save(passport);
		
		
	}

	@Override
	public void DeletePerson() {
		
		
	}

	@Override
	public void getRecordByperson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Void getRecordByPassport() {
		// TODO Auto-generated method stub
		return null;
	}	
}
