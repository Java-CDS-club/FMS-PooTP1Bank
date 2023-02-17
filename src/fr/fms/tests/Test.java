package fr.fms.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import fr.fms.entities.User;

public class Test {

	public static void main(String[] args) {

		// TODO gérer les affichages et les jeux de test ,
		// TODO liaisons entre les interfaceImpl : customers-accounts-operations
		// TODO sortir peut être le menu principal de ServiceBank !
		// TODO relation entre account et operation => diagramme de classe

		// generer des customers
User macron = new User(1, "Macron", "Emmanuel", "emmanuel.macron@gouv.fr", "55 Rue du Faubourg Saint-Honoré, 75008 Paris", "01 01 01 01 01",
			 LocalDateTime.of(1977, 12, 21,12,0));
System.out.println(macron);
macron.setRole("ADMIN");
System.out.println(macron);

User biden = new User(2, "Biden", "Jojo", "joe.biden@fms-ea.com", "1600, Pennsylvania Avenue, Washington DC", "0 563 241 115",
		 LocalDateTime.of(1942, 11, 20,5,35));
System.out.println(biden);
// int id, String lastName, String firstName, String email, String address, String phoneNumber,
// Date birthDate, String role
//LocalDateTime.of(2015, 12, 25, 12, 0);



		// generer des comptes
		// faire des operations
	}
}