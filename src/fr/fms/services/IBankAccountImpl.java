package fr.fms.services;

import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;

public class IBankAccountImpl implements IBankAccount {

	private static Map<Integer, Account> accounts;

	public static Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public IBankAccountImpl() {
		accounts = new HashMap<>();
	}

	/**
	 * ajouter un compte
	 * 
	 * @author Samuel_LePorcher
	 * @param account
	 * 
	 */
	@Override
	public void addAccount(Account account) {
		accounts.put(account.getId(), account);
	}

	/**
	 * trouver les comptes d'un client
	 * 
	 * @author Camille_Gaschet
	 * @param idCustomer
	 * 
	 */
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