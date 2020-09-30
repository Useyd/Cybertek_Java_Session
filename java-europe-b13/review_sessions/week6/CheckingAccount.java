package week6; 

public class CheckingAccount {

	double balance;
	long accountNumber;
	String accountHolder;
	String type = "checking"; // set checking as default value
	
	public void setInfo(double pBalance, long pAccNumber, String pAccHolder) {
		
		System.out.println("Setting account info...");
	    
		balance = pBalance;
		accountNumber = pAccNumber;
		accountHolder = pAccHolder;
		
		System.out.println("Account Holder: " + pAccHolder);
		System.out.println("Account Numder: " + pAccNumber);
		System.out.println("Your balance: " + pBalance);
			
	
	}public void getAccountInfo() {
		System.out.println("Checking Amount: $" + balance + "," + accountNumber + "," + accountHolder);
	
	
	}public void deposit(double amount) {
		System.out.println("Depositing $ " + amount + " to account number: " + accountNumber);
	
		balance += amount;
	
	}public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from account number: " + accountNumber); 
		if(amount<=balance) {
		
		balance -= amount;
		}else {
		
		System.out.println("ERROR: Insufficient Funds...");	
		}
		
	}public void purchase(String item, double price) {
		System.out.println("Purchasing " + item + " for $" + price);
	
		if(price<=balance) {
			balance-=price;
			
		}else  {
			System.out.println("Insufficient Funds - Overdraft fee is applied");
		    balance -= (price+35); //35 as overdraft fee...
		}
	
	
		System.out.println("Transaction completed for " + item + " ,current balance: $" + balance);
	}
	
	
	
	
	
	
}
