package day36_staticClassMembers;

public class StaticMethods {

	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		
		// -> show2(); we can't call an instance method in static method
	
		      show4();
		      System.out.println(name);
       //  -> System.out.println(age); we can't call an instance variable on static method like this too    
	}
	
    public  void show2() {
		
		show1(); // we can call static method in instance method
	    System.out.println(name);
	    System.out.println(age);
	    
    }

    public  void show3() {
	
    	show2();
    	show1();
        	
	
    }
	
    public static void show4() {
	
	
    }	
	
}
