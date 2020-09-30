package day8_control_flow_statements_Part2;

public class task34 {

	public static void main(String[] args) {

		int sub1,sub2,sub3;
		sub1=17;
		sub2=100;
		sub3=98;
		double average= (double) (sub1+sub2+sub3)/3; //explicit casting -> int to double for see the decimals
		                                             //otherwise outcome will just show 71.0, data loss
		System.out.println("Average is: " + average);
		
		if (0<=average && 59>=average) {
			System.out.println("Your grade is F");
			
		}else if (60<=average && 69>=average) {
			System.out.println("Your grade is D");
			
		}else if (70<=average && 79>=average) {
			System.out.println("Your grade is C");
			
		}else if (80<=average && 89>=average) {
			System.out.println("Your grade is B");
			
		}else if (90<=average && 100>=average) {
			System.out.println("Your grade is A");
			
		}else {
			System.out.println("Invalid Value");
		}
		
	}

}
