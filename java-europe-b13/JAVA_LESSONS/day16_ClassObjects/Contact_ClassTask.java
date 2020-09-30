package day16_ClassObjects;

public class Contact_ClassTask {

	String name;
	int phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling " + name + " ....");
	}
	
	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber + " ....");
	}
	
	public void sendEmail() {
		System.out.println("Sending e-mail to " + email + " ....");
	}
}
