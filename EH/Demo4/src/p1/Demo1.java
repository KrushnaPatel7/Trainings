package p1;
class A{
	int a;//0
	A(){}
	void abc() {}
	abstract void xyz();
}
class A1{}
//class A2 extends A1,A{}--not possible
abstract class B{
	int b;//0
	B(){}
	void abc() {}
	abstract void xyz();
	
interface I{
	public static final int i=100;
	int a=100;
	//I{} --not allowed 
	void aaa();
	public abstract void xyz();
}
interface J{}
interface K extends I,J {}

public class Demo1 {
	public static void main(String args[]) {
		A a=new A();
		System.out.println(a.a);
		//B b =new B();
		//I i =new I();
	}
}
}
