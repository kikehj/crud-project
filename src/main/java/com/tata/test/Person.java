package com.tata.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
    @GeneratedValue
    private int id;
	private String name;
	private String address;
	private String dob;
	
	public Person() {}
	
	public Person(int id, String name, String address, Date dob) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(dob);
		this.dob = today;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}
	

}
