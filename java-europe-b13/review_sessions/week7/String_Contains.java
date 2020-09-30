package week7;

public class String_Contains {

	public static void main(String[] args) {
		
		String str = "Amazon";
		System.out.println(str.contains("Amazon"));
		System.out.println(str.contains("amazon"));
		System.out.println(str.contains("AmaZon"));

		
		if(str.contains("Web")) {
			
			System.out.println("There is web in the string");
		}else {
			
			System.out.println("There is no web in the string");
		}
		
		
		String email = "employee@gmail.com";
		
		if(email.contains("hotmail")) {
			
			System.out.println("This is a hotmail account");
			
		}else if (email.contains("gmail")) {
			
			System.out.println("This is a gmail account");
			
		}else if (email.contains("yahoo")) {
			
			System.out.println("This is a yahoo account");
			
		}
		
		
		
		
		
		
		
		
	}

}
