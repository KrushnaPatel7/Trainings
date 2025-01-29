import java.util.Scanner;

class A
{
		int id;
		int  age;
		int salary;
		String name; 
		String des;
	
		A(){
			Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter ID:");
			 id=sc.nextInt();
			System.out.println("Enter Name:");
			 name=sc.next();	
			System.out.println("Enter Age:");
			age=sc.nextInt();
			System.out.println("Enter salary:");
			 salary=sc.nextInt();	
			System.out.println("Enter Designation:");
			des=sc.next();	

		}
		void display()
		{ 
		System.out.println("====================");
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);

		}
}
class Demo4
{
	public static void main(String Args[])
	{
		A a=new A();
		a.display();	
	}
}