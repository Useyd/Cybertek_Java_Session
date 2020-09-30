package week8;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] nums = {5, 6, 11, 7, 25, 90};
		
		double prices[] = {19.99, 23, 5, 5.99, 102, 5};
		
		for (int itDoesNotMatter: nums ) {//it will take the nums array values and assigns to itDoesntMatter  
			
			System.out.println(itDoesNotMatter);
			
		}
		
		for (double price: prices) {
			
			System.out.println(price);
			
		}

	}

}
