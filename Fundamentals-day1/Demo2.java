import java.util.Scanner;
class Demo2
{
	public static void main(String Args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();	
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter salary:");
		int salary=sc.nextInt();	
		System.out.println("Enter Designation:");
		String des=sc.next();	
		
		System.out.println("My Id is: " +id);
		System.out.println("My Name is:" +name);	
		System.out.println("My Age is: " +age);	
		System.out.println("My Salary is: " +salary);	
		System.out.println("My Designation is: " +des);
	}
}		