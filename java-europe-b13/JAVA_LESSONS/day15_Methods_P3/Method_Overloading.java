package day15_Methods_P3;

public class Method_Overloading {

	public static void main(String[] args) {

		System.out.println(sum(3,5)); //calling first sum method with 2 parameters

		System.out.println(sum(3,5,6)); //calling second sum method with 3 parameters
		
		System.out.println(sum(3,5,6,8));//calling third sum method with 4 parameters
	
	
		//write sum and ctrl + space -> it will show you possibilities with shortcuts
	
	}

	
	//method name is same but parameter quantity is different
	
	
	public static int sum(int a, int b) {
	
	return a+b;
    
	}public static int sum(int a, int b, int c) {
		
	return a+b+c;	
	
	}public static int sum(int a, int b, int c, int d) {
		
	return a+b+c+d;	
	}




/*    OVERLOADING TYPES:
 * 
 * 1- Number of parameters
 *    Ex:
 *    add(int,int)
 *    add(int,int,int)     
 * 
 * 2- Data Type of Parameters
 *    Ex:
 *    add(int,int)
 *    add(int,float)
 *    
 * 3- Sequence of data type parameters
 *    Ex:
 *    add(int,float) 
 *    add(float,int)
 * 
 * 4- Main Method can be overloaded too
 * 
 *    public static void main(String[] args) ->JVM only compiles with this one
 *    public static void main(String args)
 *    public static void main()
 *-----------------------
 *
 * Invalid Types:
 *
 *1- int add(int,int)
 *   float add(int,int) -> data type different but parameters same so. overloading focusing on parameters so this is invalid.    
 * 
 * 
 * 
 */









}