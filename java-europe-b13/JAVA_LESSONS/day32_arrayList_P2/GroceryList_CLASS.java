package day32_arrayList_P2;

import java.util.ArrayList;

public class GroceryList_CLASS {

//creating an ArrayList first
ArrayList<String> groceryList = new ArrayList<>();
	
    //creating a new method for adding items to list.
	public void addGroceryListItem(String item) {
		
		groceryList.add(item);
	
	}
	
	//creating a new method for printing the list
	public void printGroceryList() {
		
		System.out.println("You have " + groceryList.size() + " items in your grocery list" );
		
		for(int i=0;i<groceryList.size();i++) {
			
		 System.out.println(  (i+1)   + ". " + groceryList.get(i));
		 //                   we want it to start from 1 like:
		 //                   1. Milk
		 //                   2.Bread
		 //                   so we should add 1 to i. Otherwise it will start from 0.
		
		}
	}
	
	//creating a new method for replacement.
	public void modifyGroceryItem(int position,String newItem) {
		
		groceryList.set(position,newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified");
	
	}
	
	//creating a new method for removing option
	public void removeGroceryItem(int position) {
		
		groceryList.remove(position);
	
	}
	
	//creating a new method for finding the item that user wants to search
	public String findItem(String searchItem) {//Based on index number it'll give String. So we'll create a method that returning string
		
		int position = groceryList.indexOf(searchItem);
		
		if(position>=0) {
			
			return groceryList.get(position);
		
		}
		
		return null;// if it is not in there it will return null
	}
	

}
