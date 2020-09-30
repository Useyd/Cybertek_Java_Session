package day10_ControlFlowStatements_Part4;

public class Task45_Number_declaration {

	public static void main(String[] args) {

		int num1=10;
		int num2=10;
		int repeat=8;
	
		for (int i=1; i<=repeat; i++) {
			
			if (num1>num2) {
				System.out.println("Number 1 is greater than Number 2");
				
			}else if (num2>num1) {
				System.out.println("Number 2 is greater than Number 1 ");
			
			}else if (num1==num2) {
				System.out.println("Numbers Are Equal");
			
			}
		}
		
	
	}

}
