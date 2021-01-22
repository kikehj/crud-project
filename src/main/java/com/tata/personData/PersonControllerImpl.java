package com.tata.personData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonControllerImpl implements PersonController {

	@Autowired
	private PersonService service;
	
	@Override
	@RequestMapping(path="/create", method = RequestMethod.POST)
	public void createPerson(@RequestBody Person person) {
		
		service.create(person);
		
	}

	@Override
	@RequestMapping(path="/read", method = RequestMethod.GET)
	public List<Person> readPerson() {
		
		return service.read();
		
	}
	
	@Override
	@RequestMapping(path="/update", method = RequestMethod.POST)
	public void updatePerson(@RequestBody Person person) {
		
		service.update(person);
		
	}
	
	@Override
	@RequestMapping(path="/delete/{id}", method = RequestMethod.DELETE)
	public void deletePerson(@PathVariable int id) {

		service.delete(id);
		
	}
	
}
