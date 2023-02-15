package fr.fms.entities;
import java.util.Date;

public class SavingAccount extends Account {

	private double interestRate;

	public SavingAccount(double interestRate, int id, String accountNumber, double balance, User user, Date date) {
		super(id, accountNumber, balance, user, date);
		this.interestRate=interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", toString()=" + super.toString() + "]";
	}



}
