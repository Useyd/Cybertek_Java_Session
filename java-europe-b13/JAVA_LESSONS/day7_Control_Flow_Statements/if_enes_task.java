package day7_Control_Flow_Statements;

public class if_enes_task {

	public static void main(String[] args) {

		int num1 = 0;
		
		
		if (num1 %2 == 0 ^ num1 == 0 ) { //when we divide 2, if there isn't any remaining then its even
			
			System.out.println(num1 +" is even");
			
		}
		
		if (num1 %2 != 0) { //when we divide 2, if there is a remain its odd
			
			System.out.println(num1 + " is odd");
		}
		
		if (num1 == 0) {
			
			System.out.println("Zero is not our type babe");
		}
	}
}
