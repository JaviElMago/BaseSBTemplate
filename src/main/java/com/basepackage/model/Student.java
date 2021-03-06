package com.basepackage.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
	
	@Id
	private Long id;
	
	@Column(name = "name", length = 30)
	private String name;
	
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "dob", length = 30)
	private LocalDate dob;
	
	@Column(name = "age", length = 3)	
	private Integer age;
		
	public Student() {
		super();
	}
	
	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"name\":\"" + name + "\", \"email\":\"" + email + "\", \"dob\":\"" + dob
				+ "\", \"age\":\"" + age + "\"} ";
	}

}
