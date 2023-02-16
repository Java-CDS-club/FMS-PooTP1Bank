package fr.fms.entities;

import java.util.Date;

public class User {

	private int id;
	private String lastName;
	private String firstName;
	private String email;
	private String address;
	private String phoneNumber;
	private Date birthDate;
	private String role = "USER";

	public User(int id, String lastName, String firstName, String email, String address, String phoneNumber,
			Date birthDate, String role) {

		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + ", role="
				+ role + "]";
	}
}