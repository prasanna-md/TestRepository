//sample program for abstraction
package com.abstraction;

public class World {

	public static void main(String[] args) {
		Animal d1 = new Dog();
		d1.talk();//functionality is provided but concrete class dog
		System.out.println("____________");
		Cat c1=new Cat();
		c1.talk();//functionality is provided but concrete class cat
		System.out.println("_____________");
		Animal a;
		a=new Dog();
		a.talk();//functionality is provided but concrete class animal
		System.out.println("______________");
		a=new Cat();
		a.talk();//functionality is provided but concrete class animal

	}

}
