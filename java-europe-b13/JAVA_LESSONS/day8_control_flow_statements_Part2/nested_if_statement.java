package day8_control_flow_statements_Part2;

public class nested_if_statement {

	public static void main(String[] args) {

		boolean isRushHour=false;
		int carType=2;
		double price=0.0;
		
		if (carType==1) { // if it's true it will check other if condition below
			              
			if (isRushHour) {
				
				price=30.0;
				
			}else {
			
				price=5.0; // otherwise directly goes to else condition
			    }
			
		}else if (carType==2) { //if carType is 2 it will check for this line
				                
				if(isRushHour) { //if it's truei then it'll check the condition in  here
					price=55.30;
				}else {
					price=15.99;
				}
			} 
			System.out.println("Toll cost " + price);
		}
	}


