package project;

import java.util.Scanner;
interface I{
	abstract void cab() ;
}
abstract class emp
{
	 int id;
	    int age;
	    String name;
	    String designation;
	    int salary ;
	    emp()
	    {
	    Scanner s1 = new Scanner(System.in);
 
        System.out.print("Enter your Name: ");
        name = s1.nextLine();
 
        System.out.print("Enter ID: ");
        id = s1.nextInt();
        s1.nextLine();
 
        System.out.print("Enter Age: ");
        age = s1.nextInt();
        s1.nextLine();
	    }
	   abstract void raisesalary() ;
}
class Developer extends emp implements I{
	String designation="Developer";
    int salary=50000;
    Developer() {

    }
 
    void display() {
    	System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
    }
 
    void raisesalary() {
        salary = salary + 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }

	@Override
	public void cab() {
		System.out.println("Company Cab");
		
	}
}
 
class Tester extends emp implements I{
	String designation="Tester";
	int salary=30000;

 
    Tester() {
    }
 
    void display() {
    	System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My age: " + age);
        System.out.println("My Designation is: " + designation);
    }
 
    void raisesalary() {
        salary = salary + 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }

	@Override
	public void cab() {
		System.out.println("Company Bus");
		
	}
}
 
class Clerk extends emp implements I{
	String designation="Clerk";
	int salary=20000;

 
    Clerk() {
    }
 
    void display() {
    	System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My age: " + age);
        System.out.println("My Designation is: " + designation);
    }
 
    void raisesalary() {
        salary = salary + 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }

	@Override
	public void cab() {
		System.out.println("Company Bus");
		
	}
}
 
public class Project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        Developer d = null;
        Tester t = null;
        Clerk c = null;
 
        int ch1 = 0, ch2 = 0;
 
        do {
        	System.out.println("================================");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Commute ");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();
 
             if (ch1 == 1) {
                do {
                 	System.out.println("================================");
                    System.out.println("1) Developer");
                    System.out.println("2) Tester");
                    System.out.println("3) Clerk");
                    System.out.println("4) Back");
                    System.out.print("Enter your choice: ");
                    ch2 = sc.nextInt();
 
                    if (ch2 == 1) {
                        d = new Developer();  
                    } else if (ch2 == 2) {
                        t = new Tester();  
                    } else if (ch2 == 3) {
                        c = new Clerk();  
                    }
 
                } while (ch2 != 4);               
             
            } 
            else if (ch1 == 2) {
                
                if (d!=null) {d.display();}
                if (t!=null) { t.display();}
                if (c!=null) { c.display();}
            
            }
            else if (ch1 == 3) {
                // Raise salary
            	do {
            	System.out.println("================================");
                System.out.println("1) Developer");
                System.out.println("2) Tester");
                System.out.println("3) Clerk");
                System.out.println("4) Back");
                System.out.print("Enter your choice: ");
                ch2 = sc.nextInt();

                if (ch2==1) {
                    System.out.println("Raising salary for Developer...");
                    d.raisesalary();
                } if(ch2==2) {
                    System.out.println("Raising salary for Tester...");
                    t.raisesalary();
                }  if (ch2==3) {
                    System.out.println("Raising salary for Clerk...");
                    c.raisesalary();
                }
            	}while(ch2!=4);
            } else if (ch1 == 4) {
                // Commute    
            	do {
            		System.out.println("================================");
                    System.out.println("1) Developer");
                    System.out.println("2) Tester");
                    System.out.println("3) Clerk");
                    System.out.println("4) Back");
                    System.out.print("Enter your choice: ");
                    ch2 = sc.nextInt();
            	if (ch2==1) {
                    System.out.print("Commute By :");
                    d.cab();
                } else if (ch2==2) {
                    System.out.print("Commute By :");
                    t.cab();
                } else if (ch2==3) {
                    System.out.print("Commute By :");
                    c.cab();
                } 
            	}while(ch2!=4);
            }
            else if (ch1 == 5) {
                // Exit the program
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (ch1 != 5);      }
}
 
 
