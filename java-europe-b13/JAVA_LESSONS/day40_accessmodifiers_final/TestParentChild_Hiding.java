package day40_accessmodifiers_final;

public class TestParentChild_Hiding {

	public static void main(String[] args) {
		
		Child_Hiding s = new Child_Hiding();
		System.out.println("Value of x before increment: " + s.x);

		s.increment();
		System.out.println("Value of x after increment: " + s.x);
		
		Parent_Hiding p = new Parent_Hiding();
		System.out.println("Value of x before increment: " + p.x);
		
		p.increment();
		System.out.println("Value of x after increment: " + p.x);
	}

}
