package com.security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.security.service.PersonServiceImp;
@SpringBootApplication
public class AssociationMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AssociationMappingApplication.class, args);

		PersonServiceImp personserviceimpl=context.getBean(PersonServiceImp.class);
		
		personserviceimpl.savePerson();
	
	}
}
