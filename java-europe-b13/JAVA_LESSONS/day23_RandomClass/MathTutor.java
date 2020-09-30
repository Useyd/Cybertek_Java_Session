package day23_RandomClass;

import java.util.*;//we can use * for call all classes in java.util


public class MathTutor {

	public static void main(String[] args) {
		
		int num1, num2, sum, userAnswer;
		
		Scanner sc = new Scanner(System.in);
	    Random  rn = new Random();
	    
	    
	    num1 = rn.nextInt(100);
	    num2 = rn.nextInt(100);
	    
	    System.out.println("What is the answer to the following problem?");
	    System.out.println(num1 + "+" + num2 + "= ?");
	    System.out.println("Your Answer:");
	    userAnswer = sc.nextInt();
	    sum = num1 + num2;
	    
	    if (userAnswer == sum)
	    System.out.println("Correct! You got it!");	
	    else
	    System.out.println("Sorry. Wrong Answer :(. The correct answer is " + sum);	
	
	
	
	
	
	
	
	
	
	}

}
