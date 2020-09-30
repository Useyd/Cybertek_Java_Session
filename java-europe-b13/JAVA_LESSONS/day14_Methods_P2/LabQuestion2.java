package day14_Methods_P2;

public class LabQuestion2 {

	public static void main(String[] args) {


		love6(5,1);
		love6(3,5);
		love6(6,145);
		
	}

	public static void love6(int num1, int num2) {

		int sum=num1+num2;
		int difference=num1-num2;
		if(num1==6 || sum==6 || difference==6 ) {
		System.out.println(true);
		}else {
		System.out.println(false);
		}
	}

}
