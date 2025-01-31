package ABCD;

import java.util.*;

class A
{	
	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age= sc.nextInt();
		if(age>60)
		{
			throw new MaxAgeException();
		}
		else if(age<18)
		{
			throw new MinAgeException();
		}
		else
		{
			System.out.println("Valid Age ....!");
		}
	}
}
class Demo1
{
	public static void main(String args[]) 
	{
		try
		{
			A a = new A();
			a.display();
		}
		catch(MaxAgeException ma)
		{
			System.out.println("Age more the 60 is not alowed ");
		}
		catch(MinAgeException ma)
		{
			System.out.println("Age less the 18 is not alowed ");
		}
	}	
}
class MaxAgeException extends RuntimeException
{
	public MaxAgeException()
	{
	}
}
class MinAgeException extends RuntimeException
{
	public MinAgeException()
	{
	}
}