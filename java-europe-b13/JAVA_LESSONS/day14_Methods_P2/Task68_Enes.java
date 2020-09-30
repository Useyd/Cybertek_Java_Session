package day14_Methods_P2;

public class Task68_Enes {
	final static int retirementAge = 65;
	static int age;
	
	
	public static void main(String[] args) {

//System.out.println(calculateAge(1990));
System.out.println(yearsUntilRetirement("Mike",1945));
		
		
	}

	public static String yearsUntilRetirement(String name, int year) {
 		calculateAge(year);
	    int yearsUntilRetirement = retirementAge-age;
 		if(yearsUntilRetirement<=0)
			return name + " can retire anytime";
 		
 		return name + " retires in " + yearsUntilRetirement + " years";
	}

	public static String calculateAge(int year) {

		age = 2020-year;
		if(year>2020 || year<1900)
		return "please use realistic number";	
		
		return "your age is " + age;
	}

	    
}
