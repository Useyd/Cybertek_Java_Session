package week4;

public class LabelStatements {

	public static void main(String[] args) {


		int i=0;
		
		outer:
			do {
				
				i=8;
				
				inner:
					while(true) {
						
						
						
						System.out.println(i--);
					if(i==4) {       //whenever i = 4
						
						break outer; //break outer loop
					}
					
					}
				
			
			}while(true);
		
	}

}
