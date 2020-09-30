package day16_ClassObjects;

public class CellPhoneClass {

	public static void main(String[] args) {


		CellPhone_ClassTask cellPhone1 = new CellPhone_ClassTask();
		cellPhone1.brand="Samsung s5";
		cellPhone1.color="Red";
		cellPhone1.price=124.85;
		cellPhone1.screenSize=6.1;
	
		cellPhone1.getInfo();
		cellPhone1.call();
		cellPhone1.message();
		cellPhone1.takeAphoto();
		System.out.println();
		
		CellPhone_ClassTask cellPhone2 = new CellPhone_ClassTask();
		cellPhone2.brand="Huawei Mate 10Lite";
		cellPhone2.color="White";
		cellPhone2.price=1284.85;
		cellPhone2.screenSize=6.5;
	
		cellPhone2.getInfo();
		cellPhone2.call();
		cellPhone2.message();
		cellPhone2.takeAphoto();
		System.out.println();
		
		CellPhone_ClassTask cellPhone3 = new CellPhone_ClassTask();
		cellPhone3.brand="Apple Iphone X";
		cellPhone3.color="Blue";
		cellPhone3.price=1128.85;
		cellPhone3.screenSize=5.7;
		
		cellPhone3.getInfo();
		cellPhone3.call();
		cellPhone3.message();
		cellPhone3.takeAphoto();
		System.out.println();
		
		CellPhone_ClassTask cellPhone4 = new CellPhone_ClassTask();
		cellPhone4.brand="GM 9";
		cellPhone4.color="Black";
		cellPhone4.price=18.85;
		cellPhone4.screenSize=5.1;
		
		cellPhone4.getInfo();
		cellPhone4.call();
		cellPhone4.message();
		cellPhone4.takeAphoto();
	    System.out.println();
		 
		CellPhone_ClassTask cellPhone5 = new CellPhone_ClassTask();
		cellPhone5.brand="Nokia 6300";
		cellPhone5.color="Black";
		cellPhone5.price=999999.85;
		cellPhone5.screenSize=0.1;
		
		//We added brand, screen size, color and price words in class with a getInfo method. 
		//We can add something before printing in here too without adding a method to class.. No need to return back and modify the class...
		//For example:
		System.out.println("###LEGEND###");
		System.out.println("Brand: " + cellPhone5.brand);
		System.out.println("Screen Size: " + cellPhone5.screenSize + " inches");
		System.out.println("Color: " + cellPhone5.color);
		System.out.println("Price: " + "$" +cellPhone5.price);
		
		cellPhone5.call();
		cellPhone5.message();
		//no photo taking ability. Sorry :)
	
	
	
	
	
	
	
	
	
	
	}

}
