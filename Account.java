//Abelardo Magana Jr., Kendrick Affel, amagana60@toromail.csudh.edu, kaffel1@toromail.csudh.edu

public class Account{
	private boolean isClosed; 
	private int accNum; 
	private double balance; 
	private Customer customer; 
	private String accName; 
	private static int counter = 1000; 

	protected Account() {
		isClosed = false; 
		balance = 0.0;
		accNum = counter; 
		counter++; 

	}
	public Account(Customer c, String accountName) {
		this.customer=c;
		this.accName=accountName;
		isClosed=false;
		balance=0;
		accNum = counter; 
		counter++;

	}
	public void deposit(double amount){
		if (amount > 0 && !isClosed) {
			balance += amount; 
			System.out.println("Deposit successful, balance is: " + balance);

		}
		else {
			System.out.println("Deposit failed, balance is: " + balance); 
		}

	}
	public void withdrawl(double amount) {
		if(balance - amount >= 0 && amount >=0 && !isClosed){
			balance -= amount;
			System.out.println("Withdrawl is successful, balance is: " + balance);
		}
		else{
			System.out.println("Withdrawl has failed, balance is: " + balance); 
		}
	}
	public boolean isClosed() { 
		return isClosed;
	}
	public void setClosed(boolean closed) { 
		isClosed = closed; 
	}
	public double getBalance() {
		return balance; 
	}
	public void setBalance(double balance){
		this.balance = balance; 
	}
	public int getAccountNum() { 
		return accNum;
	}
	public void setAccountNum(int accNum){
		this.accNum= accNum; 
	}
	public String getAccountName(){
		return accName;
	}
	public void setAccountName(String accName){
		this.accName = accName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer){
		this.customer= customer;
	}

	public String toString(){
		return String.format("%d(%s) : %s : %s : %s : %.1f : %s", accNum, accName, customer.getFirstName(), customer.getLastName(), customer.getSocialSecurity(), balance, (isClosed == false ? "Account Open" : "Account Closed"));
	}
}