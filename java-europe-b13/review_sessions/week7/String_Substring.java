package week7;

public class String_Substring {

	public static void main(String[] args) {
		
	 String word = "Java is fun";
	 
	 System.out.println(word.substring(5));
     System.out.println(word.substring(0,4));
     System.out.println(word.substring(5,7));
	 System.out.println(word.substring(3,3));//blank
	
	 
	 //how to get a particular substring
	 String s1 = "the best Java Core course in Europe is Cybertek.";
	 String myTarget = "Europe";
	 
	 int beginIndex=s1.indexOf(myTarget);
	 int endIndex=beginIndex + myTarget.length();
	 
	 System.out.println(s1.substring(beginIndex, endIndex));
	 
	 //how to find all substrings of a given String
	 
	 String s2 = "Cybertek";
	 
	 for(int i=0; i<s2.length(); i++) {
		 
		 
		 for(int j=i; j<=s2.length(); j++) {
			 
			 System.out.println(s2.substring(i,j));
			 
		 }
		 
	 }
	 
	 
	 
	 
	 
	}

}
