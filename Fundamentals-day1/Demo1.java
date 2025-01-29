class A{
	A()
	{
		System.out.println("Hi class A");
	}
}

class B{
	B(){
		System.out.println("Hi class B");
	}
}
 
class Demo1
{
	public static void main(String args[])
	{
		System.out.println("Hi welcome to java");
		A a=new A();
		B b= new B();
	}
}