package day17_ClassObjects_P2;

public class CapitalOneBank {

	public static void main(String[] args) {

		BankAccount account1= new BankAccount();
		
		account1.accountHolder = "Mike Smith" ;
		account1.accountNumber = 12345; 

		account1.deposit(250);
		account1.showBalance();
		
		account1.withdraw(100);
		account1.showBalance();
		
		account1.charge(50, "table");
		account1.showBalance();
	}

}
