package day40_accessmodifiers_final;

public class CarTest_Protected {

	public static void main(String[] args) {
		
		Car_Protected c = new Car_Protected();
		
		c.model = "M3";
		c.year = 2017;
		//c.door = 4;
		c.engine = 5.2;

		System.out.println(c.toString());
	}

}
