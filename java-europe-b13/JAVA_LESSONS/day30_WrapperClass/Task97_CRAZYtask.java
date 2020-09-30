package day30_WrapperClass;import java.util.Arrays;

public class Task97_CRAZYtask {

	public static void main(String[] args) {
		
	String s = "(((W&e**_lco73me %t%o co!@$,,<re> <J>>>$@av'''*a777.||}{";	
    
	//Write a method that returns: Welcome to core Java.
	
	System.out.println(toJava(s));
	
	}

	public static String toJava(String s) {
		
		String dummy = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
		 	                                          //adding this condition for spaces between the words.	
			dummy +=s.charAt(i);
				
			}
			
		}
		return dummy;
		
	}
}
