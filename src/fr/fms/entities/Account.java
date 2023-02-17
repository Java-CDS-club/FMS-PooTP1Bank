package fr.fms.entities;

import java.util.Date;

public abstract class Account {

	private int id;
	private String accountNumber;
	private double balance;
	private User user;
	private Date date;

	public Account(int id, String accountNumber, double balance, User user, Date date) {

		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.user = user;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
