package day30_WrapperClass;

public class ParcingValues {

	public static void main(String[] args) {
		
		String numberAsString = "2018"; //that value is string. we can not do arithmetic calculations with this value
		System.out.println(numberAsString);
		
		int number = Integer.parseInt(numberAsString);//we are converting string to integer 
		System.out.println(number);

		numberAsString+=1;// its String so output will be 20181
		number+=1;// its integer so output will be 2019
		
		System.out.println(numberAsString);
		System.out.println(number);
	
		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);
	
		int i = 10;
		String s = String.valueOf(i);
		System.out.println(s); //it will return "10" as string
	   
		String s2 = Integer.toString(i);
		System.out.println(s2); //it will return "10" as string
	}

}
