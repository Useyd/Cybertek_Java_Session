package Day21_StringManipulation_P3;

public class String_Substring {

	public static void main(String[] args) {


		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println();
		
		System.out.println(sentence.substring(5,11));//Goes to index 5 takes it and continues to 11-1(10th index included).

		System.out.println(sentence.substring(5, sentence.length()-5));//length is 32 in here So 32-5=27. It starts from 5 and stops on 31.
	
	
		String chars = "{{}}";//Take string inside the curly braces
		String word = "AUTOMATION";
		
		String one = chars.substring(0,2);//{{
		String two = chars.substring(2);//}}
		System.out.println(one+word+two);//{{AUTOMATION}}
		
	
	
	}

}
