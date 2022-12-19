//Abelardo Magana Jr., Kendrick Affel, amagana60@toromail.csudh.edu
import java.util.ArrayList;
import java.util.Optional; 

public class Bank{ 
	private ArrayList<Account> accounts;

	public Bank(){
		accounts = new ArrayList<>();

	}
	public void addAccount(Account account) {
		accounts.add(account);

		System.out.println("The account number is " + account.getAccountNum()); 

	}
	public void listAccounts(){
		accounts.forEach(System.out::println);
	}
	public void depositAccount(int accNum, double amount){
		Optional<Account> account = accounts.stream().filter(a -> a.getAccountNum() == accNum).findFirst();
		if(account.isPresent()) { 
			account.get().deposit(amount);
		}
		else{ 
			System.out.println("Account can not be found");
		}
	}
	public void withdrawlAccount(int accNum, double amount) {
		Optional<Account> account = accounts.stream().filter(a -> a.getAccountNum() == accNum).findFirst();
		if(account.isPresent()){
			account.get().withdrawl(amount);
		}
		else {
			System.out.println("Account can not be found");

		}
	}
	public void closeAccount(int accNum){
		Optional<Account> account = accounts.stream().filter(a -> a.getAccountNum() == accNum).findFirst();
		if(account.isPresent()){ 
			account.get().setClosed(true);
			System.out.println("Account is closed, balance is " + account.get().getBalance() + ",deposits are no longer possible");

		}
		else {
			System.out.println("Account can not be found");
		}
	}
}