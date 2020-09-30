package day6_logical_operators;

public class logical_operator_precedence {

	public static void main(String[] args) {

		/* 
		 Precedence of logical operators (highest to lowest)
		 _____________________________________
		 
		  Highest Precedence !
		                     &&
		  Lowest Precedence  ||
		 _____________________________________
		 
		
		 ****************************************************************************************
		 
		 
		 Precedence of all Operators
		 _________________________________________________________________________________________________________________________
		 
		 Order of Precedence     Operators               Description
		 
		 1                       -(unary negation), !    Unary negation, logical NOT
		 2                       +. -                    Addition, subtraction
		 3                       *, /, %                 Multiplication, division,, modulus
		 4                       <, >, <=, >=            Less than, Greater than, Less  than or Equal to, Greater than or Equal to
		 5                       ==, !=                  Equal to, not equal to  
		 6                       &&                      Logical AND
		 7                       ||                      Logical OR 
		 8                       =, +=, *=, /=, %=       Assignment and combined assignments
		 
		 __________________________________________________________________________________________________________________________
						 
		 */
		
		
		
		//Task
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		//20<30 || 30>=30 -> T || ignores -> T
		System.out.println("comp = " + comp);
		System.out.println("------------------------------");
		
		//Task
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny;";
		Degree = 80;
				
	    boolean comp2 = (!(OutsideWeather=="Rainy"||Degree==80 ));
		//(!(F||T)) -> !T -> F 
	    System.out.println("comp2 = " + comp2);
		System.out.println("------------------------------");
	    
		//Task
	    int b=2;
	    boolean res = ++b == 2 || --b == 2 && --b ==2;
	    
	    //b in memory: 2 -> 3 -> 2 -> 1 
	    //res        : 3==2 || 2==2 && 1==2
	    //             F    || T    && F 
	    //             F    || F -> F
	    System.out.println("res = " +  res);
	    System.out.println("------------------------------");
	    
	    //Task
	    boolean x = true, z = true;
	    int y = 20;
	    x = (y!=10) || (z=false); // in here there is a assignment operator exists =
	    //  T || ignores here -> True
	    System.out.println("x = " + x);
	    System.out.println("------------------------------");
	    //Task 
	    //Create a double variable with the value 20
	    //Create a second variable of type double with the value 80
	    //Add both numbers up and multiply by 25
	    //Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
	    // Print remaining total (#4) is equal to 20 or less: true/false
	    
	    double d1=20;
	    double d2=80;
	    double res1 = (d1 + d2)*25;
	    double remainder = res1%40;
	    System.out.println("Remaining total is equals to 20 or less? - " + (remainder<=20));
	
	
	
	}

}
