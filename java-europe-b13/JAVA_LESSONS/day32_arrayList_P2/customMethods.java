package day32_arrayList_P2;

import java.util.ArrayList;
import java.util.*;
public class customMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		//Calling a method which is named printList and accepting an ArrayList with Integer objects.
		printList(numsList);
		

		ArrayList<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
	    System.out.println();
	    
		//creating a primitive double value with a method called sumList.
		//sumList method accepts an ArrayList as a parameter
		double sum = sumList(doubleList);
	    System.out.println(sum); //27.200000000000003 
	    System.out.println(Math.round(sum));//it will round the double to 27... Eye-pleasing vision for the number.
	
	    //creating an ArrayList that accepts Integer objects with the method called getList (accepts 1 to 15 elements in it). 
	    ArrayList<Integer> list = getList(15);
	    System.out.println(list.toString());
	
	    //creating an ArrayList that accepts Integer objects with the method called getRandomList (size is 20).
	    ArrayList<Integer> rList = getRandomList(20);
	    System.out.println(rList.toString());
	
	    //it will convert String to Integer
	    ArrayList<String> strnums = new ArrayList<>();
	    strnums.add("123");
	    strnums.add("33");
	    strnums.add("12");
	    		
	   	ArrayList<Integer> converted = convertToIntList(strnums);
        System.out.println(converted);
	
	}

	public static void printList(ArrayList<Integer> numsList) {
		
		System.out.println("ArrayList: " + numsList);
		
		System.out.print("Values: ");
		for (Integer nums: numsList) {
			
			System.out.print(nums + " ");
		}
		
	}
	
	
	public static double sumList(ArrayList<Double> doubleList) {
		
		double sum=0.0;
		
		for(Double sumList: doubleList ) {
			
			
			sum+=sumList;
			
		}
		
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=0; i<size; i++ ) {
			
		newList.add(i);
			
		}
		
		return newList;
	}

	public static ArrayList<Integer> getRandomList(int size) {
		
		Random get = new Random();
		ArrayList<Integer> newOne = new ArrayList<>();
		
		
		for(int i=0; i<size; i++) {
		
			newOne.add(get.nextInt(100));
			
		}

		return newOne;
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(String str: strList) {
			
			newList.add(Integer.parseInt(str));
		}
	
		return newList;
	
	}
}
