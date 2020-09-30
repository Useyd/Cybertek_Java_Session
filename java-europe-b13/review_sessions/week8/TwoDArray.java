package week8;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
	
		String[][] list = new String [4][3];
		
		//row1
		list[0][0] = "Potatoes";
		list[0][1] = "Carrots";
		list[0][2] = "Onions";
		
		//row2
		list[1][0] = "Apples";
		list[1][1] = "Kiwis";
		list[1][2] = "Figs";
		
		//row3
		list[2][0] = "Milk";
		list[2][1] = "Egg";
		list[2][2] = "Cheese";
		
		//row4
		list[3][0] = "Bread";
		list[3][1] = "Bagel";
		list[3][2] = "Muffin";
		
		//ALTERNATIVE SYNTAX FOR LIST!
		String[][] list2 = { {"Potatoes", "Carrots", "Onions"}, {"Apples", "Kiwis", "Figs"},{"Milk", "Egg", "Cheese"},{"Bread", "Bagel", "Muffin"} };
		
		
		System.out.println(Arrays.deepToString(list));
	
	
		System.out.println();
		
		
		//print all vegetables using a loop
		for(int i=0; i<list[0].length; i++) {
			
			System.out.println(list[0][i]);
		}
		
		System.out.println();
		
		
		//print all dairy using for each  loop
		for(String each: list[2]) {
			
			System.out.println(each);
		}
	
	
	
	
	
	
	}

}
