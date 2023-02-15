package fr.fms.entities;

import java.util.Date;

public class DepositOperation extends Operation {

	


	public DepositOperation(int id, Date operationDate, double amount, Account account) {
		super(id, operationDate, amount, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DepositOperation [toString()=" + super.toString() + "]";
	}
}
