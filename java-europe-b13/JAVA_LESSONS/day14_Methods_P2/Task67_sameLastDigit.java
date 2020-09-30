package day14_Methods_P2;

public class Task67_sameLastDigit {

	public static void main(String[] args) {

    //lastDigit(7,17) --> true
	//lastDigit(6,17) --> false		
	//lastDigit(3,113)--> true	
	
		boolean lastOne= lastDigit(7,17);
		boolean lastOne1= lastDigit(6,17);
		boolean lastOne2= lastDigit(3,113);
		boolean lastOne3= lastDigit(783,113);
		
		System.out.println(lastOne);
		System.out.println(lastOne1);
		System.out.println(lastOne2);
		System.out.println(lastOne3);
	}

	public static boolean lastDigit(int i, int j) {
        
	
		
		return (i%10==j%10);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
