package week8;

public class SumArray {

	public static void main(String[] args) {
		
		
		//loop through each item and if you find price more than
		//100 print "item is too expensive"
		//exit the loop
		
		double prices[] = {19.99, 230, 5, 5.99, 102, 5};

		for (double price: prices) {
			
			if(price>100) {
				
				System.out.println("item is too expensive");
			    break;	
			}
		}

		//sum of array
		
		
		double sum=0;
		for(double total: prices) {
			
			sum+=total;
			
		}
		
		System.out.println("Total price is: " + sum);
		
}
}
