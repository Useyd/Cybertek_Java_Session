package week2;

public class operator_precedence {

	public static void main(String[] args) {

		int result=3*7%3-4-6;
		
		//(3 * 7) % 3 - 4 - 6; -> 21%3-4-6
		//(21 % 3) - 4 - 6 -> 0 - 4 - 6
		//(0 - 4) - 6 -> - 4 - 6
		// - 4 - 6 -> -10
		
		System.out.println(result);
	}

}
