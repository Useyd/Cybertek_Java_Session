package day44_oopReview.call_center;

public class CallCenterTest {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you...");
		wa.videoCall();
		wa.accept();
		
		wa.getCount();
		wa.setCount(4);
		
		//Interfaces
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		System.out.println("--------------------------------");
		
		VoiceCallable obj = new WhatsApp();
		
		((MessagingApp) obj).launch(); //CASTING
		((MessagingApp) obj).allOSCompatible=false; //CASTING
		
		obj.call("Mr. Tom");
		
		((WhatsApp) obj).videoCall(); //CASTING
		
		((VideoCallable) obj).videoCall(); //CASTING
 		
		MessagingApp wa2 = new WhatsApp();

	}

}
