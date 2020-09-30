package day7_Control_Flow_Statements;

public class if_else_statement {

	public static void main(String[] args) {

		int score = 23;
		
		if (score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		}
		else {
			System.out.println("You failed!");
		}
		
		System.out.println("********************************");
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales=11000;
		salary=10000;
		
		if(sales>5000) {
			
			bonus=500;
			commissionRate=1.12;
			
			
			
		}
		else {
			bonus = 100;
			commissionRate=1.10;
			
		}
		
		salary=salary*commissionRate+bonus;
		System.out.println("Salary = " + salary);
		
	
	
	
	}

}
