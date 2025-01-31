package p4;
class A{
	static int x=10000;
	static void display() {
		System.out.println("Hiiii");
	}
	public static void main(String name) {
		System.out.println("My Name is :"+name);
	}
}
public class Demo {
	public static void main(String[] args) {
		A.display();
		A.main("Krushna");
		System.out.println(A.x);
	}
}
