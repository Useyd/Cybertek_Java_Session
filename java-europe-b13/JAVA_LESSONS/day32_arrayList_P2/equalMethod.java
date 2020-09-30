package day32_arrayList_P2;

import java.util.ArrayList;

public class equalMethod {

	public static void main(String[] args) {
		
		//two ArrayLists with different objects (includes same values)
		ArrayList <String> friends1 = new ArrayList<>();
		
		ArrayList <String> friends2 = new ArrayList<>();

		friends1.add("Mike"); friends1.add("Smith"); friends1.add("John"); friends1.add("Tommy");
		
		friends2.add("Mike"); friends2.add("Smith"); friends2.add("John"); friends2.add("Tommy");
	
		System.out.println(friends1);
	    System.out.println(friends2);
	
	    if(friends1.equals(friends2))
	    	System.out.println("same friends");
	
	    else 
	       System.out.println("different friends");
 	
	
	       System.out.println(friends1==friends2);//it won't work. output will be false. because equal sign only checks for the object references.
	                                              //it will check if the same objects they are 
 	                                              //in here values are same but objects are different. friends1 and friends2.
	                                              //SO WE SHOULD USE EQUALS METHOD! NOT EQUAL SIGN!
	}

}
