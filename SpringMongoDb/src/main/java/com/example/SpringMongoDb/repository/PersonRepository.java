package com.example.SpringMongoDb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMongoDb.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person,String>{
	public Person findByname(String name);
	public List<Person> findByage(String age);

}
