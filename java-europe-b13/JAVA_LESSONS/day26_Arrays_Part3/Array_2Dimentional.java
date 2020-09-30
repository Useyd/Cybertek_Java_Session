package day26_Arrays_Part3;

public class Array_2Dimentional {

	public static void main(String[] args) {
		
	
		int [][] scores = new int  [3]               [4];
        //                      row number    column number(optional)
	
        //print first row	
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		//print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		//print the third row
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		
		System.out.println("-----------------");
		
		//assigning values 
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		scores[0][3] = 40;
	
		scores[1][0] = 50;
		scores[1][1] = 60;
		scores[1][2] = 70;
		scores[1][3] = 80;
	
		scores[2][0] = 90;
		scores[2][1] = 100;
		scores[2][2] = 110;
		scores[2][3] = 120;
	
		//print first row	
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
				
		//print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
				
		//print the third row
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
	
	
	
	
	
	}
}
