package p1;
class Car{
	final int speed =200;
	String model="2020";
	int price=100000;
	void gare() {
		System.out.println("5 gares");
	}
	
}
class Benz extends Car{
	void gare() {
		System.out.println("non gares");
	}
}
class Bmw extends Car{
	
}
public class Demo2 {
	public static void main(String args[]) {
	Car c =new Car();
	System.out.println(c.speed);
	Benz b=new Benz();
	}
}
