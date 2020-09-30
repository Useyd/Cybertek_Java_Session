package day4_arithmetic_operators;

public class addition_and_concat {
	
	public static void main(String[] args) {
		
		//Number+Number=Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number+String=Concatenation
		System.out.println(5+"hello");
		
		//String+Number=Concatenation
		System.out.println("hello"+5);
		
		//String+Boolean=Concatenation
		System.out.println("hello"+ true);
		
		//String+String=Concatenation
		System.out.println("hello" + "world");
		System.out.println();
		
		
		System.out.println(2+0+3+"Cybertek"); // 5Cybertek -> Concatenation
		System.out.println("Cybertek"+2+0+5); // Cybertek205 -> 
		System.out.println(2+0+5+"Cybertek"+2+0+5); // 7Cybertek205
		System.out.println(2+0+5+"Cybertek"+(2+0+1)); // 7Cybertek3
		// Compiler doing this in line 25;
		// 2+0+5+"Cybertek"+(2+0+1)
		// first 2+0=2
		// then 2+5=7
		// 7+"Cybertek"=7Cybertek
		// 7Cybertek + (2+0+1) = 7Cybertek3 with paranthesis
		// without paranthesis;
		// 2+0+5+"Cybertek"+2+0+1
		// 2+0 = 2
		// 2+5 = 7
		// 7+"Cybertek"=7Cybertek
		// 7Cybertek+2=7Cybertek2
		// 7Cybertek2+0=7Cybertek20
		// 7Cybertek20+1=7Cybertek201
		
		
		
		
		
		
		
		
	}
}
