package com.example.SpringMongoDb.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document

public class Person {
@Id
String id;

String name;

String age;
public Person(String name,String age)
{
	this.name=name;
	this.age=age;
}
public String getName() {
	return name;
}
public String getAge() {
	return age;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(String age) {
	this.age = age;
}
public String toString()
{
	return "Person"+name+"Age"+age;
}
}
