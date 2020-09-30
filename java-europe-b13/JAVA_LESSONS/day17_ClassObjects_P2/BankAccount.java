package day17_ClassObjects_P2;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("depositing $" + amount + " to " + accountNumber);
	    balance+=amount;// balance=balance+amount...
	}


	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
	    balance-=amount;
	    
	    if(balance<0) {
	    	balance-=35;//if balance goes minus then bank will take fee as punishment.. 35..
	    }
		
	
	}


	public void showBalance() {
		System.out.println("---------------");
	
		System.out.println("Account Holder: " + accountHolder);
	    System.out.println("Account Number: " + accountNumber);
	    System.out.println("Balance: $" + balance );
	    
	    System.out.println("---------------");
	}
	
	public void charge(double price, String item) {
		if(balance>=price) {
			System.out.println("Buying " + item + " for $" + price + " from " + accountNumber);
			balance-=price;
		}
		else {
	
			System.out.println("Insufficient Funds to Purchase " + item + " from " + accountNumber);
		}
		
	}










}
