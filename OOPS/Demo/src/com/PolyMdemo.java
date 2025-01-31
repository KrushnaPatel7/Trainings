package com;
class Animal{
	public void makesound() {
		System.out.println("Animal makes a Sound");
	}
}
class Dog extends Animal{
	public void makesound() {
		System.out.println("Dog barks...");
	}
}
class Cat extends Animal{
	public void makesound() {
		System.out.println("Cat Meows...");
	}
}
public class PolyMdemo {
	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat =new Cat();
		Dog d=new Dog();
		d.makesound();
	}

}
