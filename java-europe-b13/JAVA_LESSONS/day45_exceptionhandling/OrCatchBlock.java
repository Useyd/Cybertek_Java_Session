package day45_exceptionhandling;

public class OrCatchBlock {
	
	static String str;
	
	public static void main(String[] args) {
		
		 
		
		try {
			
			System.out.println(str.toUpperCase());
			
		}catch (IllegalArgumentException | NullPointerException e) {
			
			//Exception types can not be sub-parents
			e.printStackTrace();
			
		}

	}

}
