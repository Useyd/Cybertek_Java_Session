package day31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
         
		System.out.println(cities.toString());
		System.out.println();
		
		//Print each city by using for-each loop separated by space:
		for(String value: cities) {
			
			System.out.print(value + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		//Print each city by using for iterator loop separated by space:
		for(int i=0; i<cities.size(); i++) {
			
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Removing Baku");
		cities.remove("Baku");//it will only remove the first Baku.
		cities.remove("New York");
		
		System.out.println(cities.toString());
		System.out.println();
		
		cities.add(0, "Arlington");//index 0 will be Arlington
		cities.add(1,"Istanbul");//index 1 will be Istanbul
		
		System.out.println(cities.toString());
		System.out.println();
		
		cities.add(2, "Ankara");
		System.out.println(cities.toString());
		System.out.println();
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa")); // No Bursa, so output will be -1
		System.out.println();
		
		cities.clear();//it will clear whole arrayList
		boolean empty = cities.isEmpty();// we'll check if it is empty.
	
		System.out.println(empty);// it's output will be true
	}                                            

}
