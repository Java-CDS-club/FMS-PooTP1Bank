package fr.fms.services;

import java.util.HashMap;
import java.util.List;
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
	public List<Account> findCustomerAccount(int idCustomer) {
		return null;
	}

	public void displayAccount() {
		for(Account account : accounts.values()) {
			System.out.println(account);
		}
	}

}
