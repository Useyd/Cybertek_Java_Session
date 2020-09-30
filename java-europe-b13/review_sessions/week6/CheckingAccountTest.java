package week6;

public class CheckingAccountTest {

	public static void main(String[] args) {


		//create an account
		CheckingAccount clientOne = new CheckingAccount();
		
		clientOne.accountNumber = 34125465576868L;
		clientOne.accountHolder = "Mike";
		clientOne.balance = 500.0;
		
		clientOne.getAccountInfo();
		System.out.println();
		//create another account and set data using method.
		
        CheckingAccount clientTwo = new CheckingAccount();
		
		clientTwo.setInfo(300.0, 34253546464L, "Kamil");
		System.out.println();
		
        //test deposit
		clientOne.deposit(300);//deposit was 500 before. Adding 300.
		clientOne.getAccountInfo();
		System.out.println();
		
		//test withdraw method
		clientOne.withdraw(100);
		clientOne.getAccountInfo();
		System.out.println();
		
		//call purchase method
		CheckingAccount myAccount = new CheckingAccount();
		
		myAccount.setInfo(200, 22213846546L, "Mike Smith");
        myAccount.purchase("Book", 120); 
	 
        System.out.println("Current Balance: $" + myAccount.balance);
	    System.out.println();
        
        myAccount.purchase("Shoes", 100);
	    myAccount.getAccountInfo();
	    System.out.println();
	    
	    myAccount.deposit(10000);	
	    myAccount.getAccountInfo();    
	}



}
