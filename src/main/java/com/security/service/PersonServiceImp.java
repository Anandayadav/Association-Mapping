package com.security.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Personrepo.Personrepo;
import com.security.enity.Passport;
import com.security.enity.Person;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	private Personrepo personrepo;
	
	@Override
	public Person savePerson() {
		
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
		
		
		Person savedInfo=personrepo.save(person);
		
		return savedInfo;
	}

	
}
