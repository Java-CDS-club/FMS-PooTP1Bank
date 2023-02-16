package fr.fms.services;
import java.util.Scanner;
import fr.fms.entities.Account;

public class ServiceBank {

	public static void main(String[] args) {

		System.out.println("Bienvenue chez FMS myBank™. Que souhaitez vous faire ?");
		
		int input=0;
		Scanner scan = new Scanner(System.in);

		while (input != 5) {
			
			System.out.println("1 : Créer un compte");
			System.out.println("2 : Consulter mon compte");
			System.out.println("3 : Effectuer une opération (retrait - versement - virement)");
			System.out.println("4 : Quitter l'application");;
	}
		while (!scan.hasNextInt()) scan.next();
		
			input= scan.nextInt();	
			switch(input) {
			
			case 1: // créer le compte
				System.out.println("Case 1");
			break;
			case 2:
				System.out.println("Veuillez saisir l'identifiant du compte :");
				scan.nextInt(); // Saisir l'ID du compte pour se connecter
			
			case 3: // Afficher le compte, et les informations du compte pour que l'utilisateur consulte
				System.out.println("Case 3");
				break;
			case 4:
				int operationSelect; 
				System.out.println("Sélectionner l'opération à effectuer :");
				operationSelect=scan.nextInt();
				
				switch(operationSelect) {
				case 1:
				// Effectuer un dépôt
				case 2:
					// Effectuer un retrait
				case 3:
					// Effectuer un virement (transfert)
					
				default: System.err.println("Erreur de saisie");
					break;
				}
				break;
			case 5:
				System.out.println("Quitter l'application");
				break;
			}
		}	

	public void createAccount(Account account) {
		
	}
}
