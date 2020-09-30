package week2;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {

		int x = 2;
		
		int y = x++;
		
		System.out.println(y); // x++ as post increment doesn't effect this line. It will effect next line. 
		System.out.println(x+y); // x++ changed y as 3 in this line so 2+3 became 5
        System.out.println();
		
        int a = 5;
		int b = a*5 - a++; 
		
		System.out.println(a); 
		System.out.println(b); 
		System.out.println();
		
		a = 5;
		b = a-- + ++a - a--;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(!!true);
		
	
	
	
	
	}

}
