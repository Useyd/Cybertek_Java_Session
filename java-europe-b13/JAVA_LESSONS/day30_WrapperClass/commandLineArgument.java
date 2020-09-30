package day30_WrapperClass;

public class commandLineArgument {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
	}

	//we opened the power shell to compile this code.(we write cd Desktop to go desktop) 
	//checked for the folders with ls+enter
	//we created a java class in the name of this class (with writing javac commandLineArgument.java)
	//then we assign some elements to the array of that class (with writing java commandLineArgument Apple 1 3 true etc.) 
	//and run the code. (it gave the assigning elements Apple 1 3 true in order...)
	
}
