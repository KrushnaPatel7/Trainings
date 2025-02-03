import java.util.*;
class A{
	A(){}
	A(String name){
	System.out.println("A(String name) ");
        }
	void abc(){
	System.out.println("Hi XYZ method..!");
	}	
}
class B extends A{
	B(){
	this(100);                  // same class with 1 permanent constructor
	System.out.println("Hi B()");
	}
	B(int a){ 
	super("Krushna");	//super class with 1 permanent constructor
	}
	void abc(){
	super.abc();		//same class with no arg method
	System.out.println("Hi ABC method..!");
	}
}
class Demo6{
	public static void main(String args[]){
	B b =new B();
	b.abc();
	//B b1=new B(100);
	}
}