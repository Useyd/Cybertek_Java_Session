package day7_Control_Flow_Statements;

public class task28 {

	public static void main(String[] args) {

		//revenue = price * quantity
		
		double revenue,price;
		int quantity;
		price = 5000;
		quantity = 4;
		revenue = price * quantity;
		
		double discount; 
		discount = revenue*0.1;        
				
		if (revenue>5000) {
		revenue = revenue - discount;
				
		
		}
		// Write the sout outside of the if block.
		System.out.println("discount = " + discount);
		System.out.println("revenue = " + revenue);
		
		
	}

}
