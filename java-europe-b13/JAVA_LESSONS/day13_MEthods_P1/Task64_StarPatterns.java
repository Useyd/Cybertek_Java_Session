package day13_MEthods_P1;

public class Task64_StarPatterns {

	public static void main(String[] args) {

 
		printPattern(45);
		
		
	}

	public static void printPattern(int p) {

		int i = p;
			
		for(i=0; i<=p; i++) {
			for (int j=0; j<i; j++) {
				
			System.out.print("*");	
			}

			System.out.println();
			
		}
	}

}
