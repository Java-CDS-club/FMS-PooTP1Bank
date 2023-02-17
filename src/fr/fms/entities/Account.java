package fr.fms.entities;

import java.time.LocalDate;

public abstract class Account {

	private int id;
	private String accountNumber;
	private double balance;
	private User user;
	private LocalDate date;

	public Account(int id, String accountNumber, double balance, User user, LocalDate localDate) {

		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.user = user;
		this.date = localDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = new User(user.getId(), user.getLastName(), user.getFirstName(), user.getEmail(), user.getAddress(),
				user.getPhoneNumber(), user.getBirthDate());
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + ", user=" + user
				+ ", date=" + date + "]";
	}
}