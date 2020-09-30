package day20_StringManipulation_P2;

public class String_Replace {

	public static void main(String[] args) {


		String str = "Moscow is the capital city of Russia";
		
		//str = str.replace(oldChar, newChar);
		
		str = str.replace("Moscow", "Angara").replace("Russia", "Torkiya");
		
	    System.out.println(str);
	
	    String email = "firstName_LastName@gmail.com";
	    String company = "cybertek";
	    
	    String newEmail = email.replace("gmail", company);	  
	    System.out.println(newEmail);
	   
	    
	
	
	}

}
