import java.util.LinkedList;

class Account {

	public int accountNo;
	public int balance;

	public void deposit() {
		
	}

	public void withdraw() {
		
	}

	public void createTransaction() {
		
	}

}

class ATM {

	public String location;
	public String managedby;

	public void identifies() {
		
	}

	public void transactions() {
		ATMtransactions trans = new ATMtransactions();
		trans.modifies();
	}

}

class ATMtransactions {

	public int transactionId;
	public String date;
	public String type;
	public double amount;
	public double postBalance;



	public void modifies() {
		
	}

}
class Bank {

	public int code;
	public String address;

	private LinkedList<ATM> atms = new LinkedList<ATM>();
	private LinkedList<Customer> customers = new LinkedList<Customer>();
	private LinkedList<Account> accounts = new LinkedList<Account>();

	public void addAtm(ATM x)
	{
		atms.add(x);
	}

	public void addCustomer(Customer x)
	{
		customers.add(x);
	}

	public void addAccount(Account x)
	{
		accounts.add(x);
	}


	public void manages() {
		
	}

	public void maintains() {
			}

}

class Customer {

	public int name;
	public int address;
	public int dob;
	public int cardNumber;
	public int pin;
	private Account custAcc[] = new Account[2];

	public boolean verifyPassword() {
		
	}

}

class CurrentAccount extends Account {

	
	public void withdraw() {
		
	}

}
class SavingsAccount extends Account {


}
