package com;

import java.util.*;

public class Demo4 {
	public static void main(String[] args) {
		//List l=new list(); //inetrface
				//dup are allowed
				
	
				//ArrayList al=new ArrayList();//best to search operation
				//LinkedList al=new LinkedList();//best for insert and delete
				//Legacy class:old class:1995:in this we have less methods
		        // Vector al=new Vector();
		        //Stack al=new Stack();
			   /*al.add(999);
			   al.add(5656);
		       al.add(100);
		       al.add(34);
		       Iterator i=al.iterator();
		       while(i.hasNext()) {
		    	   System.out.println(i.next());
		       }
               Collections.sort(al);
               System.out.println(al);
               Collections.reverse(al);
               System.out.println(al); */
		
				//Set s=new Set();//not allowed
				//HashSet al=new HashSet();//no dup+no order
				//LinkedHashSet al=new LinkedHashSet();//no dup+user entered order
				//TreeSet al =new TreeSet();// no dup+ sorted order
		         //HashMap map=new HashMap();// no dup +random order
				//TreeMap map=new TreeMap();// Homogeneous cannot have different types of variables as key
				LinkedHashMap map=new LinkedHashMap();//no dup+user entered order
		map.put(111,"Abi");
		map.put(456,"Harish");
		map.put(453,"Manish");
		map.put(789,"Abi");
		map.put(111,"Krushna");
		map.put("ABC","ISHA");
		map.put("XYZ","ISHA");
		map.put("ATOZ","ISHA");
		map.put("AAA","ISHA");
		map.put("BBB","ISHA");
		Set s=map.entrySet();
		Iterator i1=s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
