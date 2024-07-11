package com.task2.SimpleBlogApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    private String firstname;
    

    
    private String setPassword;
    
    private String  city;
    
    private String Occcupation;

	public User(String firstname,String setPassword, String city, String occcupation) {
		super();
		this.firstname = firstname;
	
		this.setPassword = setPassword;
		this.city = city;
		Occcupation = occcupation;
	}

	public User() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getSetPassword() {
		return setPassword;
	}

	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOcccupation() {
		return Occcupation;
	}

	public void setOcccupation(String occcupation) {
		Occcupation = occcupation;
	}
    
    
    
}
