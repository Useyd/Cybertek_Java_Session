package week5;

public class VendingMachine {

	public static void main(String[] args) {


		changeConverter(45);//gives 55 back...
		
	}

	public static void changeConverter(int priceInCents) {


		int change = 100 - priceInCents; //25 10 5 
		
		//change 30
		
		int quarters = change/25;
		
		int dimes = (change%25)/10;
		
		int nickles = ((change%25)%10)/5;
		
		System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes, and " + nickles + " nickles");
		
	}

	
	
	
		
		
	
	
	
	
	
}
