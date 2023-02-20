package fr.fms.services;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.DepositOperation;
import fr.fms.entities.Operation;
import fr.fms.entities.SavingAccount;
import fr.fms.entities.WithdrawalOperation;

public class IBankServiceImpl implements IBankService {
	private Map<Integer, Operation> operations;

	public IBankServiceImpl() {
		operations = new HashMap<Integer, Operation>();
	}

	public void addOperations(Operation operation) {// ajouter une operation dans la liste
		operations.put(operations.size() + 1, operation);
	}

	/**
	 * consulter un compte bancaire
	 * 
	 * @author Mehdioui_Ayyoub
	 * @param id
	 * @return account<Account>
	 */
	@Override
	public Account getAccount(int id) {
		Account account = IBankAccountImpl.getAccounts().get(id);// find accountById
		if (account != null)
			return account;
		return null; // pas de id !
	}

	/**
	 * effectuer un retrait
	 * 
	 * @author Mehdioui_Ayyoub
	 * @param accountId, amount
	 * 
	 */
	@Override
	public void makeWithdrawal(int accountId, double amount) {
		Account account = getAccount(accountId);// faire un retrait : trouver le compte
		if (account != null) {
			if (account instanceof CurrentAccount) {// compte courant (decouvert)
				if (((CurrentAccount) account).getBalance() + ((CurrentAccount) account).getOverdraft() >= amount) {// modifSold
					((CurrentAccount) account).setBalance(((CurrentAccount) account).getBalance() - amount);// creOpé
					WithdrawalOperation operation = new WithdrawalOperation(accountId, LocalDate.now(), amount,
							((CurrentAccount) account));
					operations.put(operations.size() + 1, operation);// ajout de l opération dans le tableau
					System.out.println("retrait effectué avec succès");
				} else
					System.out.println("votre solde n'est pas suffisant !");
			}
			if (account instanceof SavingAccount) { // compte epargne
				if (((SavingAccount) account).getBalance() >= amount) {// modifier le solde
					((SavingAccount) account).setBalance(((SavingAccount) account).getBalance() - amount);
					WithdrawalOperation operation = new WithdrawalOperation(accountId, LocalDate.now(), amount,
							((SavingAccount) account)); // creer l opération
					operations.put(operations.size() + 1, operation);// add opération dans le tableau
					System.out.println("retrait effectué avec succès");
				} else
					System.out.println("votre solde n'est pas suffisant !");
			}
		} else
			System.out.println("l 'id saisit est invalide !");
	}

	/**
	 * effectuer un dépôt
	 * 
	 * @author SupervielleBF
	 * @param accountId, amount
	 * 
	 */
	@Override
	public void makeDeposit(int accountId, double amount) {
		Map<Integer, Account> accounts = IBankAccountImpl.getAccounts();// temporaire
		if (accounts.get(accountId) != null) { // add the amount
			accounts.get(accountId).setBalance(accounts.get(accountId).getBalance() + amount);
			// one operation related to one accountID
			// the Operation Object
			operations.put(operations.size() + 1,
					new DepositOperation(accountId, LocalDate.now(), amount, accounts.get(accountId)));// operations.get(operationId).set
			System.out.println("versement effectué avec succès");
		} else
			System.out.println("l'id saisi est invalide !");
	}

	/**
	 * effectuer un virement
	 * 
	 * @author Mehdioui_Ayyoub
	 * @param accountId, amount
	 * 
	 */
	@Override
	public void makeTransfer(int accountId_withdrawal, int accountId_deposit, double amount) {
		if (accountId_withdrawal != accountId_deposit) {
			makeWithdrawal(accountId_withdrawal, amount); // methode virement : retir => compte n1
			makeDeposit(accountId_deposit, amount);// verse => compte n2
			System.out.println("virement effectué avec succès");
		} else
			System.out.println("vous ne pouvez pas retirer et verser sur le même compte");
	}

	/**
	 * renvoie les opérations effectuées sur un compte {id}
	 * 
	 * @author SupervielleBF
	 * @param accountId, amount
	 * 
	 */
	// methode filtre sur les operations d'un compte donné
	@Override
	public Map<Integer, Operation> getOperations(int idAccount) {
		Map<Integer, Operation> returnOperations = new HashMap<>(); // hashMap de retour
		for (Operation currentOperation : operations.values()) {// Parcours map des opérations
			// vérifier si l'idAccount correspond à l'id des accounts de la map Operations
			if (currentOperation.getAccount().getId() == idAccount) {
				// stocker l'Operation courrante dans le tableau résultat
				returnOperations.put(currentOperation.getId(), currentOperation);
			}
		}
		return returnOperations;
	}
}