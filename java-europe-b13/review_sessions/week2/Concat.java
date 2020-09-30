package week2;

public class Concat {

	public static void main(String[] args) {

		int age = 30;
		
		System.out.println("My Age is " + age);
	
		String city1 = "New York";
		String city2 = "Chicago";
		double ticketPrice = 285.99;
		
		
	System.out.println("From " + city1 + " to " + city2 + " is $" + ticketPrice);
	
	System.out.println("Apple " + 45); //String + int => + is concat
	
	System.out.println(45 + " Apple"); // int + String => is concat
	
	System.out.println(45+45); // int + int => addition
	
	System.out.println(45 + 45 + " Apple"); // (int + int) + String => first two addition then concat  
	
	System.out.println("Apple " + 45 + 45); // (String+int) + int => first is concat then concat again
	//it is computing order is from left to right!
	
    System.out.println("Apple "+ (45+45)); // we paranthesed 45s. So it will be addiction in it. then concat 

	System.out.println("Apple " + 45 + 45+ " Apple"); //String + int + int + String
	                                                  //(String+int) + int + String
	                                                  //(String+int)+String
	                                                  //String+String
	
	System.out.println(("45"+"45") + 45 + 45);
	//(String+String)+int+int
	//String+int+int
	//String+int
	//String....
	
	
	
	
	}

}
