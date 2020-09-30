package day31_arrayList;

import java.util.ArrayList;

public class contains_Method {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("January");
		list1.add("February");
		list1.add("March");
		list1.add("April");
		list1.add("May");

		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;//list 1 effects list 2 in here. if sth change in list 1 then list 2 too
		System.out.println(list2);
		System.out.println();
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<String>(list1); // it will take list1 and put it in months ArrayList
        
		months.add("June");
		months.add("July");
		months.add("August");
		System.out.println(months);
		
		System.out.println(months.contains("June"));     //true
		System.out.println(months.contains("December")); //false
		System.out.println(months.contains("July"));     //true
	    System.out.println();
	    
		//how to check if February is in 2nd position
		System.out.println(months.indexOf("February") == 1);  //way 1. output true
		
		System.out.println(months.get(1).equals("February")); //way 2. output true  
		
		//check if months contains each elements of list1
		if(months.containsAll(list1)) {
			
			System.out.println("Months has all list 1");
		}else {
			
			System.out.println("Some values are missing");
		}
		
	
	
	
	
	}

}
