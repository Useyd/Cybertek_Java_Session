package week8;

import java.util.Arrays;

public class SentenceSplit {

	public static void main(String[] args) {
		
		String sentence = "Java is fun";//delimeter
		
		//find out how many words in the sentence and print
		
		String[] words = sentence.split(" ");//it will split from spaces
        System.out.println(Arrays.deepToString(words));//then creating a new array with this 
		System.out.println(words.length);//checking its length
		
		String[] words2 = words[0].split("a");
		System.out.println(Arrays.toString(words2));
	    System.out.println();
	    
		String results ="About 117,000,000 results (1.33 seconds)";
		String[] googleArr = results.split(" ");
		System.out.println(Arrays.toString(googleArr));
	    
		for(String item: googleArr) {
			
			System.out.println(item);
		}
	
		
		String[] words3 = sentence.split(" ", 1);//this method converts the array from n to n2.. EX: if 2 elements and we write " ", 1 it will change array to 1 element
                                                 //it limits the array
		System.out.println(Arrays.deepToString(words3));
        System.out.println(words3.length);
	
	
	
	

	
	}

}
