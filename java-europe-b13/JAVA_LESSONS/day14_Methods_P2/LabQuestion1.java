package day14_Methods_P2;

public class LabQuestion1 {

	public static void main(String[] args) {


		stringTimes("Hi",1);
		System.out.println();
		stringTimes("Hi",3);
	    System.out.println();
	    stringTimes("Hi",6);
	}

	public static void stringTimes(String string, int i) {

		int k=i;
		for(k=0; k<i; k++) {
			System.out.print("Hi");
		}

		
	}

}
