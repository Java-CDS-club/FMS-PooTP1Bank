package fr.fms.entities;

import java.util.Date;

public class WithdrawalOperation extends Operation {

	
	//const

	public WithdrawalOperation(int id, Date operationDate, double amount, Account account) {
		super(id, operationDate, amount, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WithdrawalOperation [toString()=" + super.toString() + "]";
	}

}
