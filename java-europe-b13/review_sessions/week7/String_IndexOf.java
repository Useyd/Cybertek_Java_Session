package week7;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word = "github";
		
		System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("b"));
	    System.out.println(word.indexOf("th"));
	    System.out.println(word.indexOf("tb")); //-1 
	
	
	
	    String languages = "java, c++, js, tomcat, c++, aws  ";
	   
	    //how can i check if c++ is in the languages string
	    
	   if(languages.indexOf("c++")>-1){
	   
		   System.out.println("c++ is there");
	   }else {
		   
		   System.out.println("c++ is not there");
	   }
	
	   System.out.println(languages.indexOf("c++",9));//it will check for c++ after fromIndex 9
	
	   int firstComma = languages.indexOf(",");
	   System.out.println("First comma: "+firstComma);
	
	   //find the last comma
	   int lastComma = languages.lastIndexOf(",");
	   System.out.println("Last comma: "+lastComma);
	
	   //find the second comma
	   int secondComma = languages.indexOf(",",5);
	   System.out.println(secondComma);
	
	   //find the third comma
	   int thirdComma = languages.indexOf(",",secondComma+1);//it will look for the third comma after secondComma+1
	   System.out.println(thirdComma);
	}

}
