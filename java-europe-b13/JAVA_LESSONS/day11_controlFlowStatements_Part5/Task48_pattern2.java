package day11_controlFlowStatements_Part5;

public class Task48_pattern2 {

	public static void main(String[] args) {


		int rows=7;
		
		
		for (int i = 1; i<=rows; i++ ) {
			
			for(int j = 1 ; j<=i ; j++) { //j<=i so i is a changeable value, when it will change star quantity will change in rows.   
				
			System.out.print("*");
		}
		
			System.out.println(); 
			
		}		
		
	}

}
