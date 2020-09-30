package day31_arrayList;

import java.util.ArrayList;

public class shopping_List {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Paper Towel");
		shoppingList.add("Dish Soap");
		shoppingList.add("Trash Bag");
		shoppingList.add("Clorex");
		shoppingList.add("Gloves");
		shoppingList.add("Shovel");
		
		//print numbers of items
		System.out.println(shoppingList.size());
		System.out.println();
		
	    //print all items in single line
	    System.out.println(shoppingList.toString());
	    System.out.println();
	    
	    //print first and last item in single line 
	    int lastitem = shoppingList.size()-1; 
	    
	    System.out.println(shoppingList.get(0) + ", " + shoppingList.get(lastitem));
	    System.out.println();
	    
	    //remove sth.
	    shoppingList.remove("Paper Towel");
	    shoppingList.remove("Shovel");
	    
	    System.out.println(shoppingList.toString());
	    System.out.println(shoppingList.get(0));//new 0 is Dish Soap
	    
	    shoppingList.remove(0);//remove 0 again
	    
	    System.out.println(shoppingList.get(0));//new 0 is Trash Bag
	    System.out.println(shoppingList.toString());
	    System.out.println();
	    
	    //print each item
	    for(String each: shoppingList) {
	    	
	    	System.out.println(each);
	     	
	    }
	    System.out.println();
	    
	    //remove all items at once
	    shoppingList.clear();
	    System.out.println(shoppingList.toString());// nothing left inside
	    
	
	
	}

}
