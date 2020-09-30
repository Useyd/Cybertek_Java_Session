package week3;

public class YesNo {

	public static void main(String[] args) {

		char yn = 'N'; //changeable, change it to Y and see the result.
		boolean isAgreed;
		
		if (yn == 'Y') {
			isAgreed = true;
			
		}else {
			isAgreed = false;
		
		}
		
		System.out.println("Agreed is " + isAgreed);
	}

}
