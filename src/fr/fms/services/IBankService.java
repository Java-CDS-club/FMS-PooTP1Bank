package fr.fms.services;

import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.Operation;

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
	
	// methode filtre sur les operations d'un compte donné
	Map<Integer,Operation> getOperations(int idAccount);
}