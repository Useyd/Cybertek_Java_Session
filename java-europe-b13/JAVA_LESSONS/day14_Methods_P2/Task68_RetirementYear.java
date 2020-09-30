package day14_Methods_P2;

public class Task68_RetirementYear {

	public static void main(String[] args) {

      /*Write two methods:
        1-calculateAge(yearBirth); and returns the age
        2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
          in 36 years”
          Example: yearsUntilRetirement(“Mike”,1990);	*/	
		
		
		yearsUntilRetirement("Mike",1990);
		
		
		
		
		
		
		
		
	
	}public static String yearsUntilRetirement(String name, int year) {
		int retirementage=50;
		int yearsUntilretirement= retirementage - calculateAge(year);
		name = "Mike";
						  
		System.out.println(name + " retires in "+ yearsUntilretirement + " years");
				
		return "your age is " + yearsUntilretirement;
		
			
	
	
	}public static int calculateAge(int yearBirth) {

		int age=2020-yearBirth;
		
		return age;
			
			
			
		}

	
	

	

	
	
	
	
	
	
	
}
