package day8_control_flow_statements_Part2;

public class task35_find_greatest_number_nested {

	public static void main(String[] args) {

		int n1 = 1000;
		int n2 = 10;
		int n3 = 100;
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is biggest");
		
		}else {
			
			if (n2>n3) {
				System.out.println("n2 is biggest");
			
			}else {
				System.out.println("n3 is biggest");
			}
			
		}
	}	
}		
	

