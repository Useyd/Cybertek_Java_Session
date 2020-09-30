package day36_staticClassMembers;

  import static       java.lang.Math.   *;//if we import all Math class elements here we can use all methods without writing the class name 
//       PackageName  className         elements(variables or methods)
public class StaticImport {

    public static void main(String[] args) {
		
    	
    	System.out.println(Math.sqrt(16));
    	
    	System.out.println(sqrt(16));//it works without the class name too. 
    	
    	System.out.println(PI);//we can now directly write the elements, without Math class adding. 
	}
	
}
