package day25_Arrays_Part2;

public class ForEachLoop {

	public static void main(String[] args) {
		
/*		                          ForEach Loop vs For Loop
		------------------------------------------------------------------------------
		#Use ForEach Loop:
		
		-When you need to access the values that are stored in an array, from the first
		 element to the last element.
		-When you do not concern the size of the array, and you do not have to create an
		 “index” variable.
		
		#Use For Loop:
		
		-When you need to change the contents of an array element
		-When you need to work through the array elements in reverse order
		-When you need to access some of the array elements, but not all of them
		-When you need to simultaneously work with two or more arrays within the loop
*/		
		
		String[] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
		double[] prices = {120.0, 12.99, 300.0, 25.0, 67.89};
 		
		
		for(int i=0; i<products.length; i++) {
			
			System.out.println(products[i]);
		}
		
		
		System.out.println("----------------------------");
		
		
		for(String prod: products) { // we can write the same loop with for each loop easily too...
			
			System.out.println(prod);
		}

		System.out.println("---------------------------");
		
		
		for(double pr: prices) {
			
			System.out.println(pr);
		}
		
		System.out.println("--------------------------");
		
		//REVERSE WRITING...
		
		for(int i=products.length-1; i>=0; i--) {
			
			System.out.println(products[i]);
			
		}
}

}
