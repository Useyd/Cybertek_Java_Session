package day43_Polymorphism;

public class InstanceOf {

	public static void main(String[] args) {
	/*	
		Instanceof operatoru bir nesneyi belirtilen bir türle karsilastirir.
		Bir nesnenin bir sinifin ornegi,
		alt sinifin bir ornegi veya belirli bir arabirimi uygulayan bir sinifin ornegi
		olup olmadigini sinamak icin kullanabilirsiniz.
	*/	
		Shape sh = new Circle();
		
		if(sh instanceof Triangle) {
			
			System.out.println("Triangle Class");
		}
		else if(sh instanceof Circle) {
			
			System.out.println("Circle class");
		}
	}
}
