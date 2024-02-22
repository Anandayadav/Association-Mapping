package com.security.Personrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.enity.Passport;

@Repository
public interface Passportrepo extends JpaRepository<Passport, Integer> {

}
