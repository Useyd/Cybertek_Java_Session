package week4;

public class Pattern1 {

	public static void main(String[] args) {

/*
  0     // row0
  01    // row1
  012
  0123
  01234
  012345
  0123456
  01234567
  012345678
  0123456789
   
 */
		
		
   for(int i=0; i<=9; i++) {
	   
	   for(int j=0; j<=i; j++) {
		   
		   System.out.print(j);
	   }
   System.out.println();
   }
		
		
		
		
	}

}
