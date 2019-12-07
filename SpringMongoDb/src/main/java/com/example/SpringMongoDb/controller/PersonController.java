package com.example.SpringMongoDb.controller;
import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMongoDb.model.Person;
import com.example.SpringMongoDb.service.PersonService;

@RestController



public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(@RequestParam String name,@RequestParam String age)
	{
		Person p=personService.create(name,age);
		return p.toString();
	}
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public Person getPersons(@RequestParam String name)
	{
		return personService.getByname(name);
	}
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Person> getAll()
	{
		return personService.getAll();
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(@RequestParam String name,@RequestParam String age)
	{
		Person p=personService.update(name,age);
		return p.toString();
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public String delete(@RequestParam String name)
	{
		personService.delete(name);
		return "Deleted"+name;
	}
	@RequestMapping(value="/deleteAll",method=RequestMethod.DELETE)
	public String deleteAll()
	{
		personService.deleteAll();
		return "Delete";
	}
	}
