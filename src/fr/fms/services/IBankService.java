package fr.fms.services;

import fr.fms.entities.Account;

public interface IBankService {
// interface ServiceBank 

	// fourni methode consulter compte {id}
	Account getAccount(int id);

	// methode retrait
	void makeWithdrawal(int accountId, double amount);

	// methode versement
	void makeDeposit(int accountId, double amount);

	// methode virement
	void makeTransfer(int accountId_withdrawal, int accountId_deposit, double amount);

}