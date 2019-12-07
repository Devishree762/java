package com.example.SpringMongoDb.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringMongoDb.model.Person;
import com.example.SpringMongoDb.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person create(String name,String age)
	{
		return personRepository.save(new Person(name,age));
	}
	public List<Person> getAll()
	{
		 return personRepository.findAll();
	}
	public Person getByname(String name)
	{
		return personRepository.findByname(name);
	}
	public Person update(String name,String age)
	{
		Person p=personRepository.findByname(name);
		p.setAge(age);
		return personRepository.save(p);
	}
	public void deleteAll()
	{
		personRepository.deleteAll();
	}
	public void delete(String name)
	{
		Person p=personRepository.findByname(name);
		personRepository.delete(p);
	}
	}

















