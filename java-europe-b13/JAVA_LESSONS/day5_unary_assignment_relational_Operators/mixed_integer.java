package day5_unary_assignment_relational_Operators;

public class mixed_integer {

	public static void main(String[] args) {
	
	int i1=5;
	int i2=10;
	float f1=15.5f;
	double d1=20.5;
	
	int res1=i1+i2; //int+int = result must be minimum int
	float res2=i1+f1;// int+float = result must be minimum float
	double res3=i2+d1;// int+double = result must be double
	
	short firstNumber=10;
	short secondNumber=20;
	
	int thirdNumber=firstNumber+secondNumber;//short+short=? Thinking as short? Wrong. System automatically change it to int. Short is wrong.
	
	short thirdNumber2= (short)(firstNumber+secondNumber);//If you want to push the system on short you can use this option. Implication...
	    
	byte b1=20;
	byte b2=2;
	
	int b3=b1*b2;
	//another option: byte b3 = (byte)(b1*b2);

	int b4=126;
	int b5=1;
	
	byte res=(byte)(b1+b2); //Casting is required if you want to write it with byte
	
	byte res5=126+1;//No casting is required
	
	
	
	
	
	
	}

}
