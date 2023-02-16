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

	public Map<Integer, Operation> operations;

	public IBankServiceImpl() {
		operations = new HashMap<Integer, Operation>();
	}

	// la date de l opération
	LocalDate date = LocalDate.now();

	/**
	 * consulter un compte bancaire
	 * 
	 * @author Mehdioui_Ayyoub
	 * @param id
	 * @return account<Account>
	 */
	@Override
	public Account getAccount(int id) {
		// find accountById
		Map<Integer, Account> accounts = new HashMap<Integer, Account>();
		Account account = null;

		account = accounts.get(id);
		if (account != null) {
			return account;
		}
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
		// faire un retrait : trouver le compte
		Account account = getAccount(accountId);
		// voir le solde si cest suffisant (montant , decouvert)
		// compte courant (decouvert)
		if (account != null) {
			if (account instanceof CurrentAccount) {
				CurrentAccount currentAccount = (CurrentAccount) account;
				if (currentAccount.getBalance() > currentAccount.getOverdraft() + amount) {
					// modifier le solde
					currentAccount.setBalance(currentAccount.getBalance() - amount);
					// creer l opération
					WithdrawalOperation operation = new WithdrawalOperation(accountId, date, amount, currentAccount);
					// ajout de l opération dans le tableau
					operations.put(operations.size() + 1, operation);
				} else {
					System.out.println("votre solde n'est pas suffisant !");
				}
			}

			// compte epargne
			if (account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				if (savingAccount.getBalance() > amount) {
					// modifier le solde
					savingAccount.setBalance(savingAccount.getBalance() - amount);
					// creer l opération
					WithdrawalOperation operation = new WithdrawalOperation(accountId, date, amount, savingAccount);
					// ajout de l opération dans le tableau
					operations.put(operations.size() + 1, operation);
				} else {
					System.out.println("votre solde n'est pas suffisant !");
				}
			}
		} else {
			System.out.println("l 'id saisit est invalide !");
		}

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

		Map<Integer, Account> accounts = new HashMap<>();// temporaire

		if (accounts.get(accountId) != null) {
			// add the amount to the account

			accounts.get(accountId).setBalance(accounts.get(accountId).getBalance() + amount);

			// one operation related to one accountID
			// the Operation Object
			operations.put(operations.size() + 1,
					new DepositOperation(accountId, date, amount, accounts.get(accountId)));// operations.get(operationId).set

			// ajouter à la liste d'objets d'opération : date du transfert, montant et
			// account approvisionné
		} else {
			System.out.println("l 'id saisit est invalide !");
		}
	}

	@Override
	public void makeTransfer(int accountId_withdrawal, int accountId_deposit, double amount) {
		// TODO Auto-generated method stub

	}

	// TODO methode filtre sur les operations d'un compte donné

}
