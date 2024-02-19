package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.enity.Person;
import com.security.service.PersonServiceImp;

@RestController
public class PersonController {
	
	@Autowired
	private PersonServiceImp personService;
	
	
	@GetMapping("/save-Person")
	public Person savePerson()
	{
		Person p=personService.savePerson();
		
		return p;
		
	}

}
