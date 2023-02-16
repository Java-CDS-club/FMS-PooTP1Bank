package fr.fms.services;

import java.util.List;
import fr.fms.entities.Account;

public interface IBankAccount {

	// Méthode qui permet d'ajouter un compte
	void addAccount(Account account);

	// todo chercher les compte d'un client
	List<Account> findCustomerAccount(int idCustomer);

}