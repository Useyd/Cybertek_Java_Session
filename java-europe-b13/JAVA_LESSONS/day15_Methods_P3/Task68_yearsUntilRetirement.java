package day15_Methods_P3;

public class Task68_yearsUntilRetirement {

	public static void main(String[] args) {

		
		yearsUntilRetirement("Mike", 2000);
		
		
	}

	public static int calculateAge(int yearBirth) {
		
		
		return 2020-yearBirth;
		
		
	}
	
	public static void yearsUntilRetirement(String name, int year) {
				
		int retirementAge = 65 - calculateAge(year);  
		
		
			
		System.out.println(name + " retires in " + retirementAge);
		
		
	}




}
