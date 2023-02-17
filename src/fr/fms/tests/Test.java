package fr.fms.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.User;

public class Test {

	public static void main(String[] args) {

		// TODO gérer les affichages et les jeux de test ,
		// TODO liaisons entre les interfaceImpl : customers-accounts-operations
		// TODO sortir peut être le menu principal de ServiceBank !
		// TODO relation entre account et operation => diagramme de classe

		// Générer des customers
		User macron = new User(1, "Macron", "Emmanuel", "emmanuel.macron@gouv.fr", "55 Rue du Faubourg Saint-Honoré, 75008 Paris", "01 01 01 01 01",
				LocalDateTime.of(1977, 12, 21,12,0));
		System.out.println(macron);
		macron.setRole("ADMIN");
		System.out.println(macron);
		User biden = new User(2, "Biden", "Jojo", "joe.biden@fms-ea.com", "1600, Pennsylvania Avenue, Washington DC", "0 563 241 115",
				LocalDateTime.of(1942, 11, 20,5,35));
		System.out.println(biden);

		// Générer des comptes
		Account macronAccount = new CurrentAccount(1, 5000, "69", 25000, macron, LocalDate.now());
		System.out.println(macronAccount);
		Account bidenAccount = new CurrentAccount(2, 15000, "77", 250000, biden, LocalDate.now());
		System.out.println(bidenAccount);
		
		// Faire des opérations
		
	}
}