package week4;

public class CapitalPatternFromMentor {

	public static void main(String[] args) {


		
//		String letters = "";
//		
//		char l = 'A';
//			
//		
//		letters +=l;
//		l='B';
//		
//		letters+=l;
//		System.out.print(letters);
//	
//	
	
		
		
		
		//NEW LOGIC FOR PATTERNS WITH WHILE LOOP
		
		char myLetter = 'A';
		String alphabet = ""; // create a blank bucket for concatenation
				
		while(myLetter<='Z') {
			//attach/concat myLetter to alphabet
			alphabet+=myLetter;
			
			//print
			System.out.println(alphabet);
			
			myLetter++;
		
		
		}
	}
	
}
