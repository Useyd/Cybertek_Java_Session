package day32_arrayList_P2;

import java.util.*;

public class GroceryList_MAIN {
	
	static GroceryList_CLASS groceryList = new GroceryList_CLASS();//calling the -GroceryList_CLASS- class to -GroceryList_MAIN- class.   
	static Scanner scanner = new Scanner(System.in);//creating scanner object for read the user input
	
	//WE'LL PUT THIS TWO OBJECTS INSIDE THE CLASS BUT NOT IN THE MAIN METHOD. IN THIS WAY, WE CAN USE THESE ONES IN ALL NEW METHODS IN THIS CLASS.
    //WHEN WE PUT THEM INTO MAIN METHOD THEY'LL ONLY WORK IN MAIN METHOD. OTHER METHODS WOULDN'T ACCESS THEM.
	//STATIC MAKES THE OBJECTS BELONG ENTIRE CLASS.
	
	public static void main(String[] args) {
/*		
	Press 
	
	     0 - To print choice options.
	     1 - To print the list of grocery items.
	     2 - To add an item in the list.
	     3 - To modify an item in the list.
	     4 - To remove an item from the list.
         5 - To search an item from the list.
         6 - To quit the application.
    Enter your choice: 0
	
    Press 
	
         0 - To print choice options.
         1 - To print the list of grocery items.
         2 - To add an item in the list.
         3 - To modify an item in the list.
         4 - To remove an item from the list.
         5 - To search an item from the list.
         6 - To quit the application.
   Enter your choice: 1
   You have 0 items in your grocery list
   
   Enter your choice: 2
   Please enter the grocery item:
   milk
   
   Enter your choice: 2
   Please enter the grocery item:
   bread
   
   Enter your choice: 2
   Please enter the grocery item:
   sugar
   
   Enter your choice: 1 
   You have 3 items in your grocery list
   1. milk
   2. bread
   3. sugar
   
   Enter your choice: 3 
   Enter your item number:
   1
   Enter replacement item:
   water
   Grocery item 1 has been modified
   
   Enter your choice: 1
   You have 3 items in your grocery list
   1. water
   2. bread
   3. sugar
   
   Enter your choice: 4
   Enter item number:
   2 
   
   Enter your choice: 1
   You have 2 items in your grocery list
   1. water
   2. bread
   
   Enter your choice: 5
   Item to search for: 
   water
   Found water in your grocery list
   
   Enter your choice: 6
*/  
		boolean quit = false;
		int choice = 0;
		
		printInstructions();
		
		while(!quit) {
			
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();//for new line.
			
			//we'll create methods for each number.
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit=true;
				break;
				
			}
			
		}	
		
	
	}
    
	//creating a method for instructions
    public static void printInstructions() {
		
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
		
	}
    
    //creating method for adding a new item -> if choice is number 2
    public static void addItem() {
		
    	System.out.println("Enter your grocery item: ");
		groceryList.addGroceryListItem(scanner.nextLine());//creating another method for user input of item
	
    }
	
    //creating method for replacement -> if choice is number 3
    public static void modifyItem() {
		
    	System.out.println("Enter item number: ");
		
    	int itemNo = scanner.nextInt();
		scanner.nextLine();//adding new line 
		
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine(); 
		
		groceryList.modifyGroceryItem(itemNo-1,newItem);//creating another method for modifying
	}
    
    //creating a method for removing. if choice is number 4.
    public static void removeItem() {
		
    	System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();//adding new line
		
		groceryList.removeGroceryItem(itemNo-1);
	}
    
    //creating a method for item searching. if choice is number 5.
    public static void searchItem() {
		
    	System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		
		if(groceryList.findItem(searchItem) != null) {//creating a new method for finding item 
			System.out.println("Found " + searchItem + " in your grocery list");
		}else {
			System.out.println(searchItem + " is not in the grocery list");
		}
    }
    
    
    
    
    
    
    
}
