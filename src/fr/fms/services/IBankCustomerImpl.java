package fr.fms.services;

import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.User;

public class IBankCustomerImpl implements IBankCustomer {

	private Map<Integer, User> customers;

	public IBankCustomerImpl() {
		customers = new HashMap<>();
	}

	/**
	 * ajouter un client
	 * 
	 * @author Samuel_LePorcher
	 * @param user
	 * 
	 */
	@Override
	public void addCustomer(User user) {

		customers.put(user.getId(), user);
	}

	public void displayCustomer() {
		for (User user : customers.values()) {
			System.out.println(user);
		}
	}
}
