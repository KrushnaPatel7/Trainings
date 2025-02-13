package project;

import java.util.*;
class Emp{
	int id;int age;int salary;
	String name;String desig;
	Scanner sc =new Scanner(System.in);
	Emp(){
		System.out.println("ID :");id=sc.nextInt();
		System.out.println("Name :");name=sc.next();
		System.out.println("Age :");age=sc.nextInt();		
	}
	void display() {
    	System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + desig);
    }
}
class Clerk extends Emp{
	public Clerk(){
		salary=30000;
		desig="Clerk";
	}
}
class Developer extends Emp{
	public Developer() {
		salary=50000;
		desig="Developer";
	}
public class Project {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int ch1=0;int ch2=0;
		ArrayList<Emp> al=new ArrayList<Emp>();
		do {
			System.out.println("==================================");
			System.out.println("1) Create");
			System.out.println("2) Display");
			System.out.println("3) Exit");
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			if(ch1==1) {
				do {System.out.println("==================================");
				System.out.println("1) Clerk");
				System.out.println("2) Developer");
				System.out.println("3) Exit");
				System.out.println("Enter your choice:");
				ch2=sc.nextInt();
				if(ch2==1) {al.add(new Clerk());}
				if(ch2==2) {
					al.add(new Developer());
				}
				}while(ch2!=3);					
			}
			else if(ch1==2) {
					Iterator i=al.iterator();
					while(i.hasNext()) {
						Emp e=(Emp)i.next();
						e.display();
					}
				}
			else if (ch1 == 3) {
	                // Exit the program
	                System.out.println("Thank you!");
	                System.exit(0);
	            } 
			else {
	              System.out.println("Invalid choice, please try again.");
				}
		}while(ch1!=3);
	}
	
}
}
