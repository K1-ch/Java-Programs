package com.encapsulation.programs;

//Encapsulation=Data hiding 
abstract public class Encapsulate {
	private String email;
	private String password;

	public abstract void validation();

	void receipt() {
		System.out.println("This is the receipt");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
