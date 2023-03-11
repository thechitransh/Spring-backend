package com.chitransh.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Username;
	
	private String Password;
	
	private String Email ;

	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		Username = username;
		Password = password;
		Email = email;
	}
		
	
		@Override
	public String toString() {
		return "User [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Email=" + Email + "]";
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

		
		

}
