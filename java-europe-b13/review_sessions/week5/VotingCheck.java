package week5;

public class VotingCheck {

	public static void main(String[] args) {


		checkIfcanVote(21);
		checkIfcanVote(12);;
		
		int age = 2020 - 1985;// it will ignore this data
		
		checkIfcanVote(32);//and go into method age.
		printAge(1990);
	
	}

	
	public static void checkIfcanVote(int age) {
		
		
		
		if (age>=18) {
		 	System.out.println("You're eligible to vote");
	
		}else {
			System.out.println("You aren't eligible to vote!");
		}
		
	}
	
	public static void printAge(int Birthday) {
		
		int age = 2020 - Birthday;
System.out.println("Birthyear: " + Birthday + " .age" + age);	
	}
	
	
	
	
}
