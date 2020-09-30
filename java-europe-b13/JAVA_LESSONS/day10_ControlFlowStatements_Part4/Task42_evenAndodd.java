package day10_ControlFlowStatements_Part4;

public class Task42_evenAndodd {

	public static void main(String[] args) {
		
		int totalo=0;
        int totale=0;
		
        for (int i=1; i<100; i++) {
			
			if (i%2==0) {
				 
			 totale=totale+i;
				
			   
			}else {
				 
			 totalo=totalo+i;
				
			}
						
		}//totals must be written after the for loop curly brace.
        System.out.println("Sum of evens is: " + totale);
        System.out.println("Sum of odds is: " + totalo);
	}
	
}
