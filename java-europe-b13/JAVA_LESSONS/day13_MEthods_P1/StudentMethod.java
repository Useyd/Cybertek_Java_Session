package day13_MEthods_P1;

public class StudentMethod {

	public static void main(String[] args) {
		//Other public static void method syntax shouldn't be in here
		
		sayHello(); //We should add displayMessage for
		            //calling the sayHello method...
		sayHello(); //We can call infinite times that second method.
		sayHello(); //It will write it how may times I declare in here sayHello...
		sayHello();
		sayHello();
		sayHello();
		sayHello();
		
		
		
		code();//added another method called code
		study();//added another method called study
		
		
		
	}//method should be written out of the main method

	
	public static void sayHello() {//custom method
		
		System.out.println("Inside sayHello method(to write this compiler goes to main method first."+ "\n"+ "So we have to call second or else methods with a message like sayHello in main method");
		System.out.println();	
	}// method ends out here 
	
	public static void code() {
		
		System.out.println("Student is studying");
	}
	
	public static void study() {
		System.out.println("Student is studying java");
	}
	
	
}
