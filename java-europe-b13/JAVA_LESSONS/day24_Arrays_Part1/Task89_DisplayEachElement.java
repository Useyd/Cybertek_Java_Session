package day24_Arrays_Part1;

public class Task89_DisplayEachElement {

	public static void main(String[] args) {
		
		//Display each array element in the console by using for loop
		
		String [] shoppingList = {"cheese", "pumpkin", "bread", "eggs", "milk", "almonds"};

		System.out.println("===Shopping List===");
		for (int i=0; i<shoppingList.length; i++) {
			
			System.out.println("      "+shoppingList[i]);
			
		}
	}

}
