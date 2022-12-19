//Abelardo Magana Jr., Kendrick Affel, amagana60@toromail.csudh.edu
import java.util.Scanner; 
public class BankMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;

		Bank bank=new Bank(); 
		do {
			displayMenu();
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					System.out.print("\nEnter first name: ");
					String fn=sc.nextLine();
					System.out.print("\nEnter last name: "); 
					String ln=sc.nextLine(); 
					System.out.print("\nEnter social security number: ");
					String ssn=sc.nextLine(); 
					System.out.print("\nEnter Account Name: "); 
					String acctName=sc.nextLine();
					bank.addAccount(new Account(new Customer(fn,ln,ssn),acctName)); 
					break;

				case 2:
					bank.listAccounts();
					break;

				case 3:
					System.out.print("Enter account number: ");
					int acctNum=sc.nextInt();
					System.out.print("Enter the amount to deposit: ");
					double amount=sc.nextDouble();
					bank.depositAccount(acctNum, amount);
					break;

				case 4:
					System.out.print("Enter account number: ");
					acctNum=sc.nextInt();
					System.out.print("Enter the withdrawal amount: ");
					amount=sc.nextDouble();
					bank.withdrawlAccount(acctNum, amount);
					break;

				case 5:
					System.out.print("Enter account number: ");
					acctNum=sc.nextInt();
					bank.closeAccount(acctNum);
					break;

				case 6:
					break;

				default:
					System.out.println("Invalid input. Try Again!");
					break;

			}
			//I changed the condition of the do while from (choice !=8) ==> (choice !=6)
			//that way we can exit the program 
		}while(choice!=6); 

	}
	private static void displayMenu() { 
		System.out.println("1 - Open Account"); 
		System.out.println("2 - List accounts"); 
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Withdraw funds");
		System.out.println("5 - Close an account");
		System.out.println("6 - Exit");
		System.out.print("\nPlease enter your choice: ");
	}
}