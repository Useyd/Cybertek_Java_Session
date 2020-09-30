package day44_oopReview.call_center;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String App_TYPE = "Messenger";
	
	public MessagingApp(){
		
		System.out.println("MessagingApp no-args constructor...");
		
	}
	
    public void MesagingApp(String name, int count) {
		
		this.name = name;
		MessagingApp.count = count;
	}

	public abstract void sendMessage(String msg);
	
	public void launch() {
		
		System.out.println("Messaging app is launching...");
	}
	
    
	
	public static void close() {
		
		System.out.println("Messaging app is closing...");
		
	}



	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		MessagingApp.count = count;
	}
	
	
}

