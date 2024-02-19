package com.security.Personrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.enity.Passport;

public interface Passportrepo extends JpaRepository<Passport, Integer> {

}
