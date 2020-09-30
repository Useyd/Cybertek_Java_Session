package day14_Methods_P2;

public class ValueReturn {

	public static void main(String[] args) {

        sum(2,3);//this won't active anymore. 

        System.out.println(sum(2,3));//we can write sum into print ln
		
        int v1 = sum(2,3);//or we can create a new int value for sum..
        
        System.out.println(v1);
		
		
	}

	
	
	
	
	public static int sum(int num1, int num2) {//instead of void we will write the type of data. Here it is integer. So int.
		
		int result;// it is a local variable. We can use it only in this method.
		           //when we want to use it outside too, we should first change void.
		result = num1+num2;
		
		return result;//then create a return for result
	
	
	}
}
