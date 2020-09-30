package day45_exceptionhandling;

public class MutliCatch {

	public static void main(String[] args) {


		try {
			
			//System.out.println(4/0);
	
			//String str = null;
			//System.out.println(str.toUpperCase());
			
			int[] n = {10,4};
			System.out.println(n[2]);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Happened");
		
		} catch(NullPointerException e) {
			
			System.out.println("Nullpointer Exception Happened");
			
		} catch(RuntimeException e) {
			
		    e.printStackTrace();  
		    
		} 

	}

}
