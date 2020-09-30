package day32_arrayList_P2;

import java.util.ArrayList;

public class removeAll {

	public static void main(String[] args) {
		
		ArrayList <Integer> list1 = new ArrayList<>();
		
		list1.add(30); list1.add(58); list1.add(57);
		
		ArrayList <Integer> list2 = new ArrayList<Integer>();
		
		list2.add(30); list2.add(528); list2.add(58); list2.add(13230); list2.add(48); list2.add(57);

		System.out.println(list1);
        System.out.println(list2);
	
        list2.removeAll(list1);//removes all matching values from list1
	
        System.out.println(list2);//updated list2 
       
	
        
	
	}

}
