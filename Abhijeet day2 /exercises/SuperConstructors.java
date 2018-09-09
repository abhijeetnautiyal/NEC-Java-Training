class BankAccount
{
	private String ownersName;
	private int accountNumber;
	private float balance;
	
	public BankAccount(int anAccountNumber, String aName)
	{
		System.out.println("Bank Account constructor called");
		accountNumber = anAccountNumber;
		ownersName = aName;
	}
	
	
	
	}

class OverdraftAccount extends BankAccount
{
	private float overdraftLimit;
	
	public OverdraftAccount(int anAccountNumber, String aName, float aLimit)
	{
		super(anAccountNumber, aName);
		System.out.println("Overdraft Account constructor called");
		
		overdraftLimit = aLimit;
		
	}
	
}


public class SuperConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverdraftAccount obj = new OverdraftAccount(123, "John", 2.4f);

	}

}
