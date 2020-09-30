package day47_Collections_Part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
	
	public static void main(String[] args) {
		
		Vector<Integer> numStack = new Stack<>();
		
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(50);
		
		System.out.println(numStack.toString());
	
		
		//check value on top of stack
		System.out.println(((Stack<Integer>)numStack).peek());
		
		//read value on top of stack then remove it
		((Stack<Integer>)numStack).pop();
		
		System.out.println(numStack.toString());
		
		System.out.println(((Stack<Integer>)numStack).peek());
		
	}

}
