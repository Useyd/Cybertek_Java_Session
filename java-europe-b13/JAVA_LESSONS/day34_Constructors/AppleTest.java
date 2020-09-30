package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple(); //a1's color is Red

		changeApple(a1);
		
		System.out.println(a1.colour);
	
		System.out.println(methodObject().colour);
	
	}

	
    public static void changeApple(Apple x) { 
	    	
    	x.colour = "White"; //changing the color
	}
    
    //this method returns an object
    public static Apple methodObject() {
    	
    	Apple b1 = new Apple();
    	return b1;
    	
    }
}
