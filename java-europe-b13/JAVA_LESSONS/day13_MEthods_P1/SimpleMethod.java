package day13_MEthods_P1;

public class SimpleMethod {

	public static void main(String[] args) {

		System.out.println("Hello from the main method(will be written first");
		displayMessage();//then it will check for displayMessage method
	    System.out.println("Back in the main method");//it will write print statement at last.
		
		
	}

	
	public static void displayMessage() {
		System.out.println("Hello from the method(it will find and write the displayMessage method");
		//then it will go back to main method and perform the sout.
	}
	
	
	
	
}
