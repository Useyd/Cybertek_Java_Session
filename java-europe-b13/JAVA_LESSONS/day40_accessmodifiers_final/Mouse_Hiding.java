package day40_accessmodifiers_final;

public class Mouse_Hiding extends Rodent_Hiding{

	protected int tailLength = 8;
	
	public void getMouseDetails() {
		
		System.out.println("tail: " + tailLength + ", parentTail: " + super.tailLength);//we should write super.blabla
		                                                                                //otherwise it will print 8 at parent one also
	}
	
}
