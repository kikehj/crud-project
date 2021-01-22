package com.tata.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	Repository repo;
	
	public void create(Person person) {
		repo.save(person);
		
	}

	public List<Person> read() {
		//System.out.println(repo.findAll());
		return (List<Person>)repo.findAll();
		
	}
	
	public void update(Person person) {
				
		repo.save(person);
		
	}
	
	public void delete(int idPerson) {
		
		repo.deleteById(idPerson);
	}
	
}
