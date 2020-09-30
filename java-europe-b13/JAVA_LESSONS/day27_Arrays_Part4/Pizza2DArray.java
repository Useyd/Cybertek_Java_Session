package day27_Arrays_Part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		String [][] pizzas = {
				
				{"pineapple", "pepperoni"}, 
				{"anchovies","mushrooms", "olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers", "zuccini", "brocoli", "spinach","shrimp"}
		                     
		                     };

		
		
		System.out.println(Arrays.toString(pizzas[0]));
		
		//to print each row with for each loop:
		System.out.println("##FOR EACH LOOP##");
		for(String[] pizza: pizzas) {
			
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println();
		
		//to print each row with for iterator loop:
        System.out.println("##FOR ITERATOR LOOP##");
		for(int i=0; i<pizzas.length; i++) {
			
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		System.out.println();
		
		//print chicken, tomatoes, onions
		for(String value: pizzas[3]) {//this words at pizzas[3]
			
			System.out.println(value);
			
		}
		
		
		
		
		
		
		
	}

}
