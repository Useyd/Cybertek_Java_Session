package day33_ClassObjects_Constructors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	
	//CONSTRUCTOR CHAINING ( this() )
	
	//we can see how chaining works with the printed number orders. (1, 2, 3)
	//JVM first goes into first constructor, then with this method it will jump to 2.
	//In the 2 constructor it finds the this method again. And with this method it will jump to 3.
	//In 3, there isn't any this method so it will start to compile the codes in it.
	//When done with 3, will return to this method in 2.
	//Completes the 2. And returns to this method in 1.
	//Finally completes 1 too and jumps to print method. And print the parameter values.
	//That's why ordering is 3 -> 2 -> 1
	
	//1
	public Mouse(int weight) { // I want to call constructor 2
		this(30, weight);// I'll write the second constructors parameters here to call it.     
		                 // Assigned 30 to numTeeth, weight has already been assigned as 15. 
		                 // So just wrote weight, it will automatically be 15.
		                 // this method must be in the first line always!
		this.weight = weight;
		System.out.println(1);
	}
	
	//2
	public Mouse(int numTeeth, int weight) { // I want to call constructor 3
		this(numTeeth, 20, weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
 		System.out.println(2);		
	}
    
	//3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight= weight;
		System.out.println(3);
	}

    public void print() {
    	
    	System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    	
    }



}
