package com.chitransh.login.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int UserID;
	
	private String Password;
	
	private String Email ;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, int userID, String password) {
		super();
		this.id = id;
		UserID = userID;
		Password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", UserID=" + UserID + ", Password=" + Password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
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
