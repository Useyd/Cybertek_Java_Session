package day31_arrayList;

import java.util.ArrayList;

public class ArrayList_Intro {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();

		//Assigning values to ArrayList
		names.add("Mike");  //0
		names.add("Smith"); //1
		names.add("John");  //2
		names.add("Claude");//3
		names.add("Louis"); //4
		names.add("Summer");//5
	
		nums.add(99);
		nums.add(9232);
		nums.add(400);
		nums.add(new Integer("100"));// former syntax
	
		//Reading from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
	    System.out.println(names.get(2));
	
	    System.out.println("Names count: " + names.size());
	    System.out.println("Nums count: " + nums.size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
