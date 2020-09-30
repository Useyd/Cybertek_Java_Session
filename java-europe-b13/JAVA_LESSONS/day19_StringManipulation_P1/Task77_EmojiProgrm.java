package day19_StringManipulation_P1;


public class Task77_EmojiProgrm {

	public static void main(String[] args) {

		 
						
		String emoji = ";)?"; // emoji -> changeable...
	
		int E = emoji.length(); 
		char C = emoji.charAt(E-2);
		char C2 = emoji.charAt(E-1);
		
		if(E==2 && C==':') {
		
			switch(C2) {
			
			case ')':
			System.out.println(emoji + " -> Smile");	
			break;
			
			case '(':
			System.out.println(emoji + " -> Sad");
			break;
			
			case '/':
			System.out.println(emoji + " -> Upset");
			break;
			
			case 'p':
			System.out.println(emoji + " -> Playful");
			break;
			
			default:
			System.out.println("Invalid");	
			}
			
			
		}else if(E==2 && C==';'){
     
			
			switch(C2) {
			
			case ')':
			System.out.println(emoji + " -> Wink");	
			break;
			
			case 'O':
			System.out.println(emoji + " -> Surprised");
			break;
			
			default:
			System.out.println("Invalid");	
			}
		
		}else {
			
			System.out.println("Invalid");
		}
	}

}
