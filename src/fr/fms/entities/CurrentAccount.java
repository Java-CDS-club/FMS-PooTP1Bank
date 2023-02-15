package fr.fms.entities;
import java.util.Date;

public class CurrentAccount extends Account {

	private double overdraft;
	
	public CurrentAccount(double overdraft, int id, String accountNumber, double balance, User user, Date date) {
		
		super(id, accountNumber, balance, user, date);
		this.overdraft=overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraft=" + overdraft + ", toString()=" + super.toString() + "]";
	}

	
}
