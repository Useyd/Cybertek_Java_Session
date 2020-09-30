package day19_StringManipulation_P1;

public class String_Length {

	public static void main(String[] args) {

       String str = "Java";//Literal type
	
       System.out.println(str.length());//length() shows the char numbers in the string including spaces...
	
       int x = str.length();
		
       System.out.println(x*10);
	
	
       String str1 = new String("Java"); //by new keyword
       
       System.out.println(str1.length());
	
	}

}
