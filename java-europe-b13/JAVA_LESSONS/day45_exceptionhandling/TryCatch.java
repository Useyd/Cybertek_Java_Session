package day45_exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {


		try {
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(4));// there is no 4 char. So it will catch here. And stops execution.
			System.out.println(str.charAt(2));
			System.out.println(str.charAt(3));
			
		}catch(Exception e) {
			
			System.out.println("Exception happened - let you know!");
			
		}

		System.out.println("After try catch block!");
	}

}
