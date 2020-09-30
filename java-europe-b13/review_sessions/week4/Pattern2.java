package week4;

public class Pattern2 {

	public static void main(String[] args) {
//		0
//		01
//		012
//		0123
//		01234
//		012345
//		0123456
//		01234567
//		012345678
//		0123456789
//      012345678
//	    01234567
//	    0123456
//	    01234
//	    0123
//	    01
//	    0
	
		for(int i=0; i<=9; i++) {
			   
			   for(int j=0; j<=i; j++) {
				 
				   System.out.print(j);
			   }
		       System.out.println();
		   }
	
	    for(int i=8; i>=0; i--) {
	    	
	    	   for(int j=0; j<=i; j++) {
	    		  System.out.print(j);
	    	}
	           System.out.println();
	    }
	
	
	
	}
}
