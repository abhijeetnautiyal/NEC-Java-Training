
abstract class Account
{
    protected String name;
    protected int accNo;
    protected double balance;
    protected String type;
    
    
    public abstract void setName(String s);
    public abstract void setAccNo(int x);
    public abstract void setBalance(double x);
    public abstract void setType(String s);
   
    
    public abstract void withdraw(double x);
    public abstract void deposit(double x);
    
    public abstract void displayDetails();
    
    
}

class SavingsAccount extends Account
{
    private double interest;

    
    public void setName(String s) {
        name = s;
    }


    public void setAccNo(int x) {
     accNo = x;
    }

    
    public void setBalance(double x) {
        balance = x;
    }

   
    public void setType(String s) {
        type = s;
    }

  
    public void withdraw(double x) {
        if(x>balance) 
        {
            System.out.println("Not sufficient Balance.");
        }
        else
        {
            balance -= x;
            System.out.println("Withdrawl Succesful");
        }        
    }

   
    public void deposit(double y) {
        balance += (balance*interest);
        balance += y;
        System.out.println("Deposit Succesful");
    }

   
    public void displayDetails() {
        System.out.println();
        System.out.println("Name    :"+name);
        System.out.println("Balance :"+balance);
        System.out.println();
    }

    
    public double getInterest() {
        return interest;
    }

    
    public void setInterest(double x) {
        interest = x;
    }

    
    
}


class CurrentAccount extends Account
{
    double min_balance = 10000;
    double penalty = 100; 

   
    public void setName(String s) {
        name = s;
    }

   
    public void setAccNo(int x) {
     accNo = x;
    }

 
    public void setBalance(double x) {
        balance = x;
    }

   
    public void setType(String s) {
        type = s;
    }

    
    public void withdraw(double x) {
        //penalty for not maintaining mininum balance
        if(balance<min_balance) balance -= penalty;
        
        if(x>balance) 
        {
            System.out.println("Not sufficient Balance.");
        }
        else
        {
            
            balance -= x;
            System.out.println("Withdrawl Succesful");
        }         
    }

    
    public void deposit(double y) {
        balance += y;
        System.out.println("Deposit Succesful");
    }

   
    public void displayDetails() {
        System.out.println();
        System.out.println("Name    :"+name);
        System.out.println("Balance :"+balance);
        System.out.println();
    }

    
    
}


public class BankAccountTest {
    
    public static void main(String[] args) {
        
        SavingsAccount s = new SavingsAccount();
        s.setName("Ram");
        s.setAccNo(4567);
        s.setBalance(0);
        s.setType("Savings");
        s.setInterest(0.04);
        
        s.deposit(1000);
        
        s.deposit(100);
        s.displayDetails();
        
        s.withdraw(455);
        s.displayDetails();
        
        
        CurrentAccount c = new CurrentAccount();
        c.setName("Shyam");
        c.setType("Current");
        c.setAccNo(5678);
        c.setBalance(0);
        
        c.displayDetails();
        
        c.deposit(5000);
        c.displayDetails();
        
        c.withdraw(500);
        c.displayDetails();
        
    }
    
}
