package day24_Arrays_Part1;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int [] scores; //declare an int array
		scores = new int[4];//Instantiate an int array of 4 elements
		
		scores[0] = 85; // Assings 85 to 1st element
		scores[1] = 70; // Assings 70 to 2nd element
		scores[2] = 95; // Assings 95 to 3rd element
		scores[3] = 90; // Assings 90 to 4th element
		
        System.out.println(scores[0]); // Print 1st array element 
        System.out.println(scores[1]); // Print 2nd array element 
        System.out.println(scores[2]); // Print 3rd array element 
        System.out.println(scores[3]); // Print 4th array element 
        
        
        //Average of the numbers with array
        
        int [] numbers;
        numbers = new int [4];
        
        numbers[0] = 45;
        numbers[1] = 67;
        numbers[2] = 66;
	    numbers[3] = 90;
	    
	    int average = (numbers[0] + numbers[1] + numbers[2] + numbers[3])/4;
	    
	    System.out.println(average);
	
	
	
}
}
