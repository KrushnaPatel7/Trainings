package p2;

public class A {
		private int a=100; // only for a single class
		public int b=200; //everywhere
		protected int c= 300; //same package +subclass in other package
		int d=400;//same package
		
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B extends A{
	void display() {
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class C{
	void display() {
		A a1=new A();
		//System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
	
}