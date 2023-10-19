package com.masai.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BookTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tableId;
	private String name;
	private String email;
	private String persons;
	private String date;
	private String time;
	private String message;
	
	@ManyToOne
	@JsonIgnore
	private Users user;
	
	public BookTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookTable(String name, String email, String persons, String date, String time, String message,
			Users user) {
		super();
		this.name = name;
		this.email = email;
		this.persons = persons;
		this.date = date;
		this.time = time;
		this.message = message;
		this.user = user;
	}

	public int getTableId() {
		return tableId;
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
	public String getPersons() {
		return persons;
	}
	public void setPersons(String persons) {
		this.persons = persons;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
