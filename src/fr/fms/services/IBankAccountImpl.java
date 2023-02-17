package fr.fms.services;

import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;

public class IBankAccountImpl implements IBankAccount {

	public Map<Integer, Account> accounts;

	public IBankAccountImpl() {
		accounts = new HashMap<>();
	}

	@Override
	public void addAccount(Account account) {
		accounts.put(account.getId(), account);
	}

	@Override
	public void findCustomerAccount(int idCustomer) {
		// Parcourir la liste des comptes
		for (Account account : accounts.values()) {
			// Pour trouver le compte qui appartient à un client en particulier {id}
			if (account.getUser().getId() == idCustomer) {
				// Afficher le compte en question
				System.out.println(account);
			}
		}
	}

	public void displayAccount() {
		for (Account account : accounts.values()) {
			System.out.println(account);
		}
	}
}