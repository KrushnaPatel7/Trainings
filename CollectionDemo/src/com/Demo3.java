package com;
import java.util.*;


public class Demo3 {
	public static void main(String[] args) {
		//List l=new list(); //inetrface
		//dup are allowed
		
		//ArrayList al=new ArrayList();//best to search operation
		//LinkedList al=new LinkedList();//best for insert and delete
		//Legacy class:old class:1995:in this we have less mehtods
		//Set s=new Set();//not allowed
		//HashSet al=new HashSet();//no dup+no order
		//LinkedHashSet al=new LinkedHashSet();//no dup+user entered order
		TreeSet al =new TreeSet();// no dup+ sorted order
		al.add(100);
		al.add(345);
		al.add(234);
		al.add(5656);
		al.add(76);
		al.add(97);
		al.add(100);
		al.add(345);
		System.out.println("================");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
