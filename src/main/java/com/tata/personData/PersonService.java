package com.tata.personData;

import java.util.List;

public interface PersonService {

	public void create(Person person);
	public List<Person> read();
	public void update(Person person);
	public void delete(int idPerson);
}
