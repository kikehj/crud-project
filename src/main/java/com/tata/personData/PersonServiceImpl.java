package com.tata.personData;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonRepository repo;
	static Logger log = Logger.getLogger(PersonServiceImpl.class);
	
	@Autowired
	public void setPersonRepository(PersonRepository repo) {
		this.repo = repo;
	}
	
	public void create(Person person) {
		log.info("Create");
		repo.save(person);
		
	}

	public List<Person> read() {
		//System.out.println(repo.findAll());
		log.info("Read");
		return (List<Person>)repo.findAll();
		
	}
	
	public void update(Person person) {
		log.info("Update");
		repo.save(person);
		
	}
	
	public void delete(int idPerson) {
		log.info("Delete");
		repo.deleteById(idPerson);
	}
	
}
