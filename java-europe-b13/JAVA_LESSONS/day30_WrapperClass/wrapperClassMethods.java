package day30_WrapperClass;

public class wrapperClassMethods {

	public static void main(String[] args) {
	     
		
		//MAX AND MIN
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println();
		System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
	    System.out.println();
        System.out.println(Character.MIN_VALUE);
	    System.out.println(Character.MAX_VALUE);
	    System.out.println();
	    
	    //IS ALPHABETIC?
	    System.out.println(Character.isAlphabetic('a')); // true
	    System.out.println(Character.isAlphabetic(1));   // false
	    System.out.println();
	    
	    String word = "java101";
	   
	    System.out.println(Character.isAlphabetic(word.charAt(0)));
	    System.out.println();
	    
	    //IS LETTER?
	    System.out.println(Character.isLetter('c')); // true
	    System.out.println(Character.isLetter('&')); // false
	    System.out.println();
	
	    //IS DIGIT?
	    System.out.println(Character.isDigit('4')); // true 
	    System.out.println(Character.isDigit('p')); // false
	    
	    System.out.println(Character.isAlphabetic(word.charAt(6)));
	
	
	
	} 

}
