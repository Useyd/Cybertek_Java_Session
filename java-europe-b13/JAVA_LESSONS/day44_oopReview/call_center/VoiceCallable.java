package day44_oopReview.call_center;

public interface VoiceCallable {
	
final boolean CAN_CALL=true;
	

    //abstract method
	abstract void call(String contact);
	
	//static method
	public static void decline() {
		System.out.println("Mike declined voice call...");
	}
	
	//default method 
	public default void accept() {
		System.out.println("Mike finally accepted voice call...");
	}

}
