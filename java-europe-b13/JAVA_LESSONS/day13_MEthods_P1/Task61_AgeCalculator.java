package day13_MEthods_P1;

public class Task61_AgeCalculator {

	public static void main(String[] args) {

		//calculator(2000) --> 20

		agecalculator(2000,2020);
		
		
		
		
	}

	public static void agecalculator(int birthyear, int currentyear) {
	
	int age = currentyear - birthyear;
	
	System.out.println("Your age is " + age);
		
	}

}
