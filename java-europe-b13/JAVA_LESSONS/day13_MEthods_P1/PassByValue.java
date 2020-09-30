package day13_MEthods_P1;

public class PassByValue {

	public static void main(String[] args) {
		int age=7;
passbyvalue(age);//we'll use int age as method parameter


		
	}

	public static void passbyvalue(int x) {// x will be 7

		x=x+1;
		System.out.println(x);

		
	}

}
