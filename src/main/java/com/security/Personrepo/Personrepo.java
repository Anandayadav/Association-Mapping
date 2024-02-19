package com.security.Personrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.enity.Person;

@Repository
public interface Personrepo extends JpaRepository<Person, Integer>{

}
