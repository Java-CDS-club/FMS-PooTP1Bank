package fr.fms.entities;

import java.time.LocalDate;

public class DepositOperation extends Operation {

	public DepositOperation(int id, LocalDate operationDate, double amount, Account account) {
		super(id, operationDate, amount, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Versement : " + super.toString();
	}
}
