package day24_Arrays_Part1;

public class Task90_CarFinder {

	public static void main(String[] args) {
		
/*		ØCreate a car array that holds 6 car names inside
		ØCheck if your array has the car name “Honda”
		ØIf it is , print “ I found your car Honda in this array”
		ØIf it is not, print “ I could not find your car Honda in this array”
*/
		
		String [] car = {"Porsche", "Hyundai","BMW", "Volkswagen","Honda", "Seat"};
		
		boolean dummy = false;//create a dummy boolean
		
		for(int i=0; i<car.length; i++) {
			
			if(car[i].equalsIgnoreCase("Honda")) { 
				dummy=true;//just one if statement for if it equals Honda
				break;
			}
			
			
		}
		   
		
		if(dummy) //outside of the loop write the last step. PrintLn's.
		System.out.println("I found your car Honda in this array");
		    
		else
		System.out.println("I could not find your car Honda in this array");
		    
		
			
	
		
}
}
