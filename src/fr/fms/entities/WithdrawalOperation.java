package fr.fms.entities;

import java.time.LocalDate;

public class WithdrawalOperation extends Operation {

	// const

	public WithdrawalOperation(int id, LocalDate operationDate, double amount, Account account) {
		super(id, operationDate, amount, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Retrait : " + super.toString();
	}

}
