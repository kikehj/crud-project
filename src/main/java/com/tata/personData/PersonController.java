package com.tata.personData;

import java.util.List;

public interface PersonController {

	public void createPerson(Person person);

	public List<Person> readPerson();
	
	public void updatePerson(Person person);
	
	public void deletePerson(int id);

	

}