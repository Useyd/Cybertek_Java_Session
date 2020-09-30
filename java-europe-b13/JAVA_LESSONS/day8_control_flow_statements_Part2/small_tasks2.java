package day8_control_flow_statements_Part2;

public class small_tasks2 {

	public static void main(String[] args) {

		//1-Write an if-else statement that assigns 20 to variable y if the variable
		//x is greater than 100. Otherwise, it should assign 0 to the variable y
		
		int y = 20,
	        x = 5; //change x value and see the result :)
	        
	        if (x>100) {
	        	
	        	y=20;
	        	System.out.println("If x is greater than 100 y is " + y);
	        }
	        else { 
                  y=0;
                  System.out.println("If x isn't greater than 100 y is " + y);
	        		        }
	        System.out.println("*****************************************"+"\n"); 
		//2-Write an if-else statement that assigns 1 to x when y is equal to 100.
	    //Otherwise, it should assign 0 to x.
	          
	    int x1,y1;
	    x1=1;
	    y1=10;
	    
	    if (100==y1) {
	    	x1=1;
	    System.out.println("If y1 equals to 100 x1 is " + x1);
	    
	    }else
	   
	    {x1=0;
	    System.out.println("If y1 isn't equals to 100 x1 is " + x1);
	    }
	    
	    System.out.println("*****************************************"+"\n");
	    //3-Write an if-else statement that assigns 0 to the variable b and assigns 1 to the variable c
	    //if the variable a is less then 10. Otherwise, it should
	    //assign -99 to the variable b and assign 0 to the variable c
	    
	    int a,b,c;
	    a=55;
	    b=0;
	    c=1;
	    
	    if(a<10) {
	    	b=0;
	    	c=1;
	    	
	    	System.out.println("If a is less than 10; b is " + b + "," + " c is " + c);
	    }else
	    {
	    	b=-99;
	        c=0;
	        System.out.println("If a is greater than 10; b is " + b + "," + " c is " + c);
	    }
	    
	    System.out.print("*****************************************");

	    
	}

}
