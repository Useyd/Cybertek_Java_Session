package day31_arrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());// output -> 0 
        System.out.println();
		System.out.println(nums.isEmpty());//Shows if the ArrayList is empty or not
	    System.out.println();
        System.out.println(nums.size() == 0);//Checking if size equals 0
	    System.out.println();
	    
	    nums.add(4);
	    nums.add(1);	
	    nums.add(44);
	    nums.add(5);
	    nums.add(10);
	    nums.add(100);
	    nums.add(55);
	    
	    nums.remove(5);//it will remove index 5
	    
	    System.out.println(nums.toString());
	    System.out.println();
	    
	    Integer n1 = new Integer(5);// if we want to remove element 5, but not index five we should create a new object
	    Integer n2 = Integer.valueOf(5); // updated syntax
	    
	    nums.remove(n1);//now we can remove element 5 directly, without using index number
	    System.out.println(nums.toString());
	    System.out.println();
	    
	    nums.remove(n2);//it is the same thing. With updated syntax
	    System.out.println(nums.toString());
	    System.out.println();
	
	    nums.remove(Integer.valueOf(4));// removing 4
	    System.out.println(nums.toString());
	    
	
	}

}
