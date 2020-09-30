package day19_StringManipulation_P1;

public class String_concat {

	public static void main(String[] args) {


	String word = "Java";
	
	System.out.println(word.concat("+selenium"));
	System.out.println(word.concat(" in eclipse"));
	
	System.out.println(word);
	
	word = word.concat("+Eclipse");//we changed the reference 
	System.out.println(word);//now it won't just write only Java...
	
	word = word.concat(" Automation");
	System.out.println(word);
	
	//word = word.concat(123); -> this won't work. Because concat() accepts only String... Not integer like 123
	
	word = word + 123; //String + Int = String -> Java+Eclipse Automation123
	System.out.println(word);
	
	word = word + true;
	System.out.println(word);
	
	String word2 = "-Hi";
	word2 = word2.concat("\n").concat("-hey").concat("\n").concat("-how are you?").concat("\n").concat("-good");
	System.out.println(word2);
	
	}

}
