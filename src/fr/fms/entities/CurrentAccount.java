package fr.fms.entities;
import java.time.LocalDate;

public class CurrentAccount extends Account {

	private double overdraft;
	
	public CurrentAccount(int id, double overdraft, String accountNumber, double balance, User user, LocalDate localDate) {
		
		super(id, accountNumber, balance, user, localDate);
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