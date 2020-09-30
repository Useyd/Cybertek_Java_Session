package day7_Control_Flow_Statements;

public class if_statements {

	public static void main(String[] args) {

		int score=100; //change the score and the outcome will change too
		
		if (score>=70) {
			//when the answer is false -> compiler directly goes out from the if block			
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
				
		}
		
		System.out.println("***********************");
		
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales=5000;
		salary=10000;
		
		if(sales>5000) {
			
			bonus=500;
			commissionRate=1.12;
			
			salary=salary*commissionRate+bonus;
			
		}
		
		System.out.println("Salary = " + salary);
		
		
		
		
		
	}

}
