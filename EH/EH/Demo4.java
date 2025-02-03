import java.util.*;
import java.io.*;
class A{

	void display(){
		String name="Rakesh";
		//name=null;
		System.out.println("Name :"+name.length());
		//System.out.println("Name :"+name.length()); NullPointerException
		int arr[]={5,3,4,6,7,8};
	      System.out.println(arr[3]);
	//String id="100A";
           String id="100";
          int uid=Integer.parseInt(id);
	  System.out.println(uid);
	
	}
}
class Demo4{
      public static void main(String args[]){
	A a=new A();
	a.display();
}
}
