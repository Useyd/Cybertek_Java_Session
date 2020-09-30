package day10_ControlFlowStatements_Part4;

public class ternary_operator {

	public static void main(String[] args) {

		String result;
		int score=88;
//		
//		if (score>60) {
//			result ="pass";
//					
//		}else {
//			result="fail";
//		}
	
		result = score>60 ? "pass" : "fail";
// it means if score>60, pass, if not fail	
	
		int x=5;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
//like nested if. if x>2 is true check x<4 if its true it equals 10 	
//this short statement same as below:	
		if (x>2) {
			if (x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
				}
		
		}else {
			System.out.println(7);
		}
	
	
	
	
	
	
	
	}

}
