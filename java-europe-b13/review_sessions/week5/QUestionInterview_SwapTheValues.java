package week5;

public class QUestionInterview_SwapTheValues {

	public static void main(String[] args) {
	
	swapNumbers(10,20);
	System.out.println();
	
	swapNumbers(22,54);
	System.out.println();
	
	swapNumbers();
	}
	
	public static void swapNumbers(int num1, int num2) {
		
		num2 = num1 + num2; // 10+20 = 30
		
		num1 = num2 - num1; // 30-10 = 20
	
		num2 = num2 - num1; // 30-20 = 10
	
		System.out.println("num1: " + num1);
	    System.out.println("num2: " + num2);
	}
	
	
	public static void swapNumbers(){//method with using 3rd. variable.
	
		int n1=10;
		int n2=20;
		int n3;
		
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("n1:" +n1);
	    System.out.println("n2:"+n2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
