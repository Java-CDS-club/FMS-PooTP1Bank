package fr.fms.services;

import fr.fms.entities.Account;

public interface IBankAccount {

	// Méthode qui permet d'ajouter un compte
	public void addAccount(Account account);

	// todo chercher les compte d'un client
	public void findCustomerAccount(int idCustomer);

}