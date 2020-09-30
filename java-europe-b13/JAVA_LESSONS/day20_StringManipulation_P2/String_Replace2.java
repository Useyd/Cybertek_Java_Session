package day20_StringManipulation_P2;

public class String_Replace2 {

	public static void main(String[] args) {
         
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");
        System.out.println(withNoSpace);
		
        System.out.println(sentence);//original string is not changing... 
		//replace , with !!!;
        
        System.out.println(sentence.replace(",","!!!"));
        
        
        String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed=mixed.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed);
		
		
		//get only the result number from string
		String result = "About 8,930,000,000 results (0.68 seconds)";
		
		result = result.replace("About ", "").replace(" results (0.68 seconds)", "");
		//replacing rest of the string with blank/nothing....		
		System.out.println(result);
	}

}
