package day27_Arrays_Part4;

public class Length {

	public static void main(String[] args) {
		
		int [][] numbers =  {      
				
				{1,2,3,4},             //-> row0
				{5,6},                 //-> row1
				{9,10,11,23,30,50,60}  //-> row2
                             
		                    };

		//display the number of rows
		System.out.println(numbers.length);
		
		//display the number of columns in each row
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("The numbers of columns in row " + i + " is " + numbers[i].length);
			
		}
		System.out.println("--------------------");
		
		for(int i=0; i<numbers.length; i++) {// for row
			
			for(int j=0; j<numbers[i].length; j++) {// for column, each row -> numbers[i].length...
				
				//run code
				System.out.println(numbers[i][j]);//row is i , column is j
				
			}
			
		}
		
}

}
