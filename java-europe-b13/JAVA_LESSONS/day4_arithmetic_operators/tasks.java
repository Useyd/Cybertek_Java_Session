package day4_arithmetic_operators;

public class tasks {
	
	public static void main(String[] args) {
		
		//Task-13;
		//Want an outcome exactly like 46 + 90 = 136;
		int num1,num2,sum;
		num1=46;
		num2=90; //I can change this two variables whenever I want. So sum will be different
		sum=num1+num2;
		
		System.out.println(num1+ " + " + num2+ " = " + sum);
        System.out.println();
      
   		//Task-14;
        //Write a Java program to convert Fahrenheit to Celcius
        //Output: 70.2 celcius is equal to 158.36 fahrenheit
        
        double celcius, fahrenheit;
        celcius=70.2; // I can change this value every time I want. 
        fahrenheit=(celcius*9/5)+32;
        
        System.out.println(celcius + " celcius is equal to " + fahrenheit + " fahrenheit");
        System.out.println();
        
        //Task-15;
        //Write a Java program that converts mile to km
        //Output: 85.0 mile is equal to 136.79424 km
        
        double mile,km;
        mile=85.0;
        km=mile*1.609344;
        
        System.out.println(mile + " mile is equal to " + km + " km" );
        System.out.println();
       
        // Task-16;
        // Write a Java program that displays the area and perimeter of a circle that
        // has a radius of 5.5 using the following formulas:
        // perimeter=2*radius*pi
        // area= radius*radius*pi
        
        final double PI=3.14; //PI can't be changed. So we should add final on the beginning of the code line
        double radius, perimeter, area;
        
        radius=5.5;
        perimeter=2*radius*PI;
        area=radius*radius*PI;
        
        System.out.println("Perimeter of the radius "+ radius + " circle equals to " + perimeter);
        System.out.println("Area of the radius " + radius + " circle equals to " + area);
        System.out.println();
        
        //Task-17;
        //Write a Java program that calculates the average of 3 numbers
        
        double average,numx,numy,numz;
        numx=10.3;
        numy=303.434;
        numz=50.434;
        
        average=(numx+numy+numz)/3;
        
        System.out.println("Average of the three numbers equals to " + average);
        
        
            
	
	
	
	
	
	
	}

}
