package day14_Methods_P2;

public class Task69_PrimeNumber {

	public static void main(String[] args) {
		System.out.println(PrimeNumber(1));
				
		
	}

	
	public static boolean PrimeNumber(int prime) {
		
		if(prime==1) return false;
	    
		if(prime==2) return true;

	    if(prime%2==0) return false;     

	    for(int i=2; i<prime; i++) {
	    
	    if(prime%i==0) return false;
	    
	    }

	    return true;

	}
	

}
