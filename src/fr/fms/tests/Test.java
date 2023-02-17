package fr.fms.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.DepositOperation;
import fr.fms.entities.Operation;
import fr.fms.entities.SavingAccount;
import fr.fms.entities.User;
import fr.fms.entities.WithdrawalOperation;
import fr.fms.services.IBankAccountImpl;
import fr.fms.services.IBankCustomerImpl;

public class Test {

	public static void main(String[] args) {

		// TODO gérer les affichages et les jeux de test ,
		// TODO liaisons entre les interfaceImpl : customers-accounts-operations
		// TODO sortir peut être le menu principal de ServiceBank !
		// TODO relation entre account et operation => diagramme de classe

		// Générer des customers
		User macron = new User(1, "Macron", "Emmanuel", "emmanuel.macron@gouv.fr",
				"55 Rue du Faubourg Saint-Honoré, 75008 Paris", "01 01 01 01 01",
				LocalDateTime.of(1977, 12, 21, 12, 0));
		User biden = new User(2, "Biden", "Jojo", "joe.biden@fms-ea.com", "1600, Pennsylvania Avenue, Washington DC",
				"0 563 241 115", LocalDateTime.of(1942, 11, 20, 5, 35));

		// Générer des comptes
		Account macronAccount = new CurrentAccount(1, 5000, "69", 25000, macron, LocalDate.now());
		Account bidenAccount = new CurrentAccount(2, 15000, "77", 250000, biden, LocalDate.now());
		Account macronSavingAccount = new SavingAccount(3, 2, "69S", 150000, macron, LocalDate.now());
		Account bidenSavingAccount = new SavingAccount(4, 3, "77S", 250000, biden, LocalDate.now());

		// Faire des opérations
		Operation deposit1 = new DepositOperation(1, LocalDate.now(), 200, macronAccount);
		Operation withdrawal1 = new WithdrawalOperation(2, LocalDate.now(), 333, macronAccount);

		// affichage et jeux de test
		System.out.println("création et affichage de deux compte bancaires :");
		System.out.println(macronAccount);
		System.out.println(macronSavingAccount);
		System.out.println("----------------------------------------------");
		System.out.println("solde du compte courant de manu:" + macronAccount.getBalance());
		System.out.println("solde du compte epargne de manu:" + macronSavingAccount.getBalance());
		System.out.println("----------------------------------------------");
		IBankCustomerImpl customerImpl = new IBankCustomerImpl();
		// ajouter dans la hashMap
		customerImpl.addCustomer(macron);
		customerImpl.addCustomer(biden);
		System.out.println("liste de nos clients :");
		customerImpl.displayCustomer();
		System.out.println("---------------------------");
		// liste des comptes
		IBankAccountImpl accountImpl = new IBankAccountImpl();
		accountImpl.addAccount(macronAccount);
		accountImpl.addAccount(bidenAccount);
		accountImpl.addAccount(macronSavingAccount);
		accountImpl.addAccount(bidenSavingAccount);
		System.out.println("la liste des comptes :");
		accountImpl.displayAccount();

		// compte inexistant

	}
}