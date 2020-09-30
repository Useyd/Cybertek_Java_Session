package day13_MEthods_P1;

public class Deep_and_deeper {

	public static void main(String[] args) {

	//you can see the order in output clearly
    System.out.println("I am starting in main");
    deep();
    System.out.println("Now I am back in main");
		
		
	}

	
	public static void deep() {
		System.out.println("I am now in deep");
	    deeper();
	    System.out.println("Now I am back in deep");
 	}
	public static void deeper() {
		System.out.println("I am in deeper");
	    
	}
	
	
	
}
