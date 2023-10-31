package com.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String city;
	static int idCount=0;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User( String name, String email, String city) {
		super();
		this.id = ++idCount;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
