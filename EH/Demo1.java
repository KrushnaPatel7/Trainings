import java.util.*;
class Demo1
{
	public static void main(String args[]){
         m1();
	}
	static void m1()
	{
	m2();
	System.out.println("Hi M1 methods...!");
	}
	static void m2()
	{
		m3();
		System.out.println("Hi M2 methods...!");
	}
	static void m3()
	{
		try
			{
			System.out.println("Hi M3 methods...!");
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter A value: ");
                        int a=sc.nextInt();
			System.out.println("Enter B value: ");
			int b=sc.nextInt();
			int res=a/b;
			System.out.println("Result is: "+res);
                   }
                   catch(InputMismatchException im){
			System.out.println("Please enter number only..!");
               }
		  catch(ArithmeticException ae){
                   System.out.println("we cannot divide anything by 0 ! ");
}
}
}