package com.restapi.restapi10;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private String passportNumber;
	
	public Student() {
		super();
	}
	public Student(Long id, String name, String passportNumber) {
		super();
		this.Id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
		
}

