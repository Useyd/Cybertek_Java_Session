package day36_staticClassMembers;

public class Campus {

	private String city;
	
	static String country;
    
    static { // static blocks are always runs first. 
    	    
    	
    	System.out.println("Static Block-1");
    	country="USA";//first assigned USA
    }
    
    public Campus(String city) {
    	
    	System.out.println("Constructor");
        this.city=city;
    }
    
    static { //because of that this one will be in output after
    	     //first static block. campus method will be printed after 
    	
    	System.out.println("Static Block-2");
        country="UK";//then UK. And last value is UK now. Output will be UK.
    }
    
}

