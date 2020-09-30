package day42_Interface;

public interface Electric {

	//instance variables must be public static final in the interface....
	//so public static final is default even if we don't write 
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; //It is public static final already..
	
	public abstract void charge();
	
	void charge2();//public abstract already. So no error. 

	public default void methodA(){
		     //code
	}
    
	public static void methodB() {
		     //code
	}

}
