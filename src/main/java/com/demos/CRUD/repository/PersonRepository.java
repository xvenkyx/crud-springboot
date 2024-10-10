package com.demos.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demos.CRUD.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
