package fr.fms.entities;

import java.time.LocalDate;

public abstract class Operation {
	// attribute
	private int id;
	private LocalDate operationDate;
	private double amount;
	private Account account;// id du compte suffit

	// const
	public Operation(int id, LocalDate operationDate, double amount, Account account) {
		this.setId(id);
		this.setOperationDate(operationDate);
		this.setAmount(amount);
		this.setAccount(account);
	}

	// methodes

	// To string
	@Override
	public String toString() {
		return "Transaction [TransactionId = " + id + ", TransactionDate = " + operationDate + ", amount = " + amount
				+ ", accountId = " + account.getId() + "]";
	}

	// get&set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(LocalDate operationDate) {
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
		this.account = account;
	}
}
