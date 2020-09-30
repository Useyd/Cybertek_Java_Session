package day31_arrayList;

import java.util.ArrayList;

public class ArrayList_EXAMPLE {

	public static void main(String[] args) {
		
	//Languages
	//Print size of ArrayList
	//Read couple of elements	

	ArrayList<String> Languages = new ArrayList<>();
	
	Languages.add("French");
	Languages.add("Turkish");
	Languages.add("English");
	Languages.add("German");
	Languages.add("Russian");
	Languages.add("Arabic");
	
	System.out.println("Number of values: " + Languages.size());
	
	System.out.println(Languages.get(0));
	System.out.println(Languages.get(5));
	System.out.println();
	
	Languages.add("Java");//adding Java. 
	System.out.println("Number of values: " + Languages.size());//expanding the ArrayList
	System.out.println(Languages.toString());
	System.out.println();
	
	Languages.remove(0);//Removing the first index
	System.out.println("Number of values: " + Languages.size());//decreasing the ArrayList
	System.out.println(Languages.toString());
	
	}

}
