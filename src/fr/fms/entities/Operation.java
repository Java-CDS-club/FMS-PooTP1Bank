package fr.fms.entities;

import java.util.Date;

public abstract class Operation {
	//attribute
	private int id;
	private Date operationDate;
	private double amount;
	private Account account;
	
	
	//const
	public Operation(int id, Date operationDate, double amount, Account account) {
		this.setId(id);
		this.setOperationDate(operationDate);
		this.setAmount(amount);
		this.setAccount(account);
	}

	//methodes



	//To string
	@Override
	public String toString() {
		return "Operation [id=" + id + ", operationDate=" + operationDate + ", amount=" + amount + ", amount=" + account.toString() + "]";
	}
	//get&set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getOperationDate() {
		return operationDate;
	}


	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = new Account(account.getId(), account.getAccountNumber(), account.getBalance(), account.getUser(), account.getDate());
	}
}
