package week4;

public class StartEnd {

	public static void main(String[] args) {


		int start=6;
		int end=13;
		
		for(int i = start; i<end; i++ ) {
			
			System.out.print(i+"|");
			
			
		}System.out.println("\n");
		
		for (int n=end; n>start; n--) {
			
		System.out.print(n+" ");	
	
		}System.out.println("\n");
	
		
		/*
		 * if start is less than end:
		 * print all the numbers between start and end
		 * if start is bigger than end
		 * print all the numbers from the end to start in reverse
		 */
		
		int start1=5;
		int end1=2;
		
		
		for(int i=start1; i<end1; i++) {
				
				for(int j=end1; j>start1; j-- ) { 
					
					System.out.print(j);
				
			
			
			}
		System.out.println(i);
		
		}
		
	}

}
