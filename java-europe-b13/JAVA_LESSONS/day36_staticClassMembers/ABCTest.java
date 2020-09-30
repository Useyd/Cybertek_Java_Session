package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		//INTERVIEW QUESTIONS
		ABC.m1();
		
		ABC o1 = new ABC();
		o1.m1();

		//whenever all of your methods in your class are static
		//and you want everyone to call them static way-ClassName.methodname(),
		//then you can simply make your constructor private
	}

}
