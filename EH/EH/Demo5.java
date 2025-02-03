import java.util.*;
class A{
	void display(){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter valid age: ");
	int age=sc.nextInt();
	if(age<18)
        {
		throw new InvalidAgeException(" invalid age bcz it is less than 18: Min age");
	}
	else if(age>60){
	throw new InvalidAgeException(" invalid age bcz it is greater than 60: Max age");
}
	else{
      System.out.println("Valid ");
   }
  }
}
class Demo5{
	public static void main(String args[]){
	try{
	A a=new A();
	a.display();
      }
	catch(InvalidAgeException e){
	System.out.println(e.getMessage());
       }
    }
}
class InvalidAgeException extends RuntimeException{
	InvalidAgeException(String msg){
	super(msg);
}
}