package day20_StringManipulation_P2;

public class String_IndexOf {

	public static void main(String[] args) {

        String word1 = "github";
		System.out.println(word1.indexOf("g")); //it will check for the g, finds it and says its index number. So it tells you g is starting from index number 0.
		
		System.out.println(word1.indexOf("th"));//th starts from 2.
		
		System.out.println(word1.indexOf("hub"));
	
	    System.out.println(word1.indexOf("Java"));//there isnt any Java in the string. so it'll give -1  as output
	
	    String url = "www.okta.com";
	    int i;
	    i = url.indexOf("."); 
	
	    System.out.println("Position of dot: " + i);
	    
	    System.out.println(url.charAt(i+1));// i+1=4; charAt will give the char which belongs index 4. So output is "o"... 
	
	    //find position of "-", and check if space is on right and left side
	    String title = "Java - Google Search";
	    int dash = title.indexOf("-");
	    
	    System.out.println(title.charAt(dash-1)); //space at left of -
	    System.out.println(title.charAt(dash+1)); //space at right of -
	
	    System.out.println("Apple");
	
	    String country = "United States of America";
	    int states = country.indexOf("States");
	    System.out.println("Position of states: " + states);
	    System.out.println();
	    
	    String word2 = "Java, c++, python, tomcat, eclipse";
	    //check if c++ in the word2
	    
	    int cplusplus = word2.indexOf("c++");
	    
	    if(word2.contains("c++")==true)	
	    System.out.println("It contains c++ and its position is: " + cplusplus);
	   
	    //INTERVIEW QUESTION!!!	
	    //and also we can return true or false with indexOf too. Because if compiler couldn't find any char giving -1:
	    //we can use this -1 as false with if's.
	    if(cplusplus>-1)
	    System.out.println(true);
	    else
	    System.out.println(false);	
	    
	}

}
