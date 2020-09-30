package day27_Arrays_Part4;

public class Students2DArray {

	public static void main(String[] args) {
		
	int[][] students = { {4,5,6},{12,5,7},{23,56,12,55,3} };	
		
		for(int[] group: students) {//for row. each row is array so int[]
			                        //here we are checking for arrays so we'll put int[] in the code
			for(int studentID: group) {//for column (inside the row in other words)
				                       //in here we are checking for the numbers only. So putting just int.
				System.out.println(studentID);
				
			}
			
			
			
			
		}
				
				
				

	}

}
