package com.masai.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String password;
	private String email;
	private String role = "USER";
	
	@OneToMany
	private List<Reviews> reviews;
	
	@OneToMany
	@JsonIgnore
	private List<BookTable> tables;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Users(String username, String password, String email, String role, List<Reviews> reviews,
			List<BookTable> tables) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.reviews = reviews;
		this.tables = tables;
	}



	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}



	public List<BookTable> getTables() {
		return tables;
	}



	public void setTables(List<BookTable> tables) {
		this.tables = tables;
	}

}
