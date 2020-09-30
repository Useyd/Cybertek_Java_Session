package day8_control_flow_statements_Part2;

public class task32 {

	public static void main(String[] args) {

		int a,b,c;
		a=200;
		b=200;
		c=200;
		
		if (a>b && a>c) {
			System.out.println("a is the biggest number");
		
		}else if  (b>a && b>c) {
			
			System.out.println("b is the biggest number");
		}else if (c>a && c>b) {
			
			System.out.println("c is the biggest number");
		}else {
			
			System.out.println("Numbers are equal");
			
		}
		
		

	}

}
