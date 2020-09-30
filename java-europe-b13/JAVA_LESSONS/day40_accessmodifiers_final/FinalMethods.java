package day40_accessmodifiers_final;

public class FinalMethods {

	public final void method1() {
		
		System.out.println("Method-1");
	}
	
	public final static void staticMethod(String word) {
		
		System.out.println("Static Method");
	}
	
	
}

class Sub extends FinalMethods {
 /*   	
    public void method1() { --> can't do overriding. Because this method has already used by final keyword in FinalMethods class.
    		
    		System.out.println("Method-1 in Subclass");
    }
    	
    public static void staticMethod(String word) { --> can't do overriding. Because this method has already used by final keyword in FinalMethods class.
    		
    		System.out.println("Static Method in Subclass");
    }
 */   
}
