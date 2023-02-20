package fr.fms.services;

import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.Operation;

public interface IBankService {
	// TODO les methodes dans la même interface => IBAccount + IBCustomer

	// interface ServiceBank

	// fourni methode consulter compte {id}
	public Account getAccount(int id);

	// methode retrait
	public void makeWithdrawal(int accountId, double amount);

	// methode versement
	public void makeDeposit(int accountId, double amount);

	// methode virement
	public void makeTransfer(int accountId_withdrawal, int accountId_deposit, double amount);

	// methode filtre sur les operations d'un compte donné
	public Map<Integer, Operation> getOperations(int idAccount);
}