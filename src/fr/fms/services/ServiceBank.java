package fr.fms.services;

import java.util.Scanner;

public class ServiceBank {

	public static void main(String[] args) {
		/**
		 * menu principal myBank
		 * 
		 * @author Samuel_LePorcher
		 * @author Camille_Gaschet
		 * 
		 */
		System.out.println("Bienvenue chez FMS myBank™. Que souhaitez-vous faire ?");

		int input = 0;
		Scanner scan = new Scanner(System.in);

		// Affichage du menu principal
		while (input < 6) {
			System.out.println();
			System.out.println("1 : Consulter mon compte");
			System.out.println("2 : Effectuer un versement");
			System.out.println("3 : Effectuer un retrait");
			System.out.println("4 : Effectuer un virement");
			System.out.println("5 : ADMIN");
			System.out.println("6 : Quitter l'application");
			System.out.println();
			while (!scan.hasNextInt())
				scan.next();
			input = scan.nextInt();
			switch (input) {
			// Consulter mon compte
			case 1:
				System.out.println("Consulter mon compte");

				break;
			// Effectuer un versement
			case 2:
				System.out.println("Effectuer un versement");

				break;
			// Effectuer un retrait
			case 3:
				System.out.println("Effectuer un retrait");

				break;
			// Effectuer un virement
			case 4:
				System.out.println("Effectuer un virement");

				break;
			// ADMIN
			case 5:
				System.out.println("ADMIN");
				input = 0;
				while (input < 3) {
					System.out.println();
					System.out.println("1 : Ajouter un client");
					System.out.println("2 : Ajouter un compte");
					System.out.println("3 : Retourner au menu principal");
					System.out.println();
					while (!scan.hasNextInt())
						scan.next();
					input = scan.nextInt();
					switch (input) {
					// Ajouter un client
					case 1:
						System.out.println("Ajouter un client");

						break;
					// Ajouter un compte
					case 2:
						System.out.println("Ajouter un compte");

						break;
					// Retourner au menu principal
					case 3:
						System.out.println("Retourner au menu principal");

						break;
					default:
						System.out.println("Erreur de saisie");
					}
				}
				break;
			// Quitter l'application
			case 6:
				System.out.println("Quitter l'application");

				break;
			default:
				System.out.println("Erreur de saisie");
			}
		}
	}
}
