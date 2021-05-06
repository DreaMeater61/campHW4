package entities;

import abstracts.entity;

public class User implements entity {

	private int nationalId;
	private String name;
	private String surname;
	private String birthYear;
	
	public User(int nationalId, String name, String surname, String birthYear) {
		super();
		this.nationalId = nationalId;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	

}
