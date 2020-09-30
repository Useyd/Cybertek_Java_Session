package week7;

public class String_Replace {

	public static void main(String[] args) {
		
		String words="pascal,unix,python";
		
		System.out.println(words.replace("pascal", "java"));
        System.out.println(words);//its not changing the original one.
	    
        System.out.println(words.replace(",", "|"));
        
        String myString = "    Horse        Cow\n\n     \r  Camel  \t\t Sheep       \n Goat";
	
        String regex = "\\s";
        
        String replacement = "";
        
        String newString = myString.replaceAll(regex, replacement);
	
	    System.out.println(newString);
	
	
	    String amazonResult = "iphone case (212,713 Results)";// just need 212713
	    
	    System.out.println(amazonResult.replace("iphone case (", "" ).replace(",","").replace(" Results)",""));
	    
	
	}

}
