package com;

import java.util.*;

class Clerk{
	
}
public class Demo2 {
	public static void main(String[] args) {
		//List l=new List(); // interface we cant create obj
		ArrayList al=new ArrayList();
		al.add(122);
		al.add(45.67);
		al.add("Krushna");
		al.add(true);
		al.add(74);
		al.add('A');
	    al.add(new Date());
		al.add(new Clerk());
		al.add(67);
		System.out.println(al);
		System.out.println("--------");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----Iterator------");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
