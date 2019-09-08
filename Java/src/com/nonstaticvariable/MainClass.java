//sample program for non static variable
package com.nonstaticvariable;

public class MainClass {

	public static void main(String[] args) {
		A ob1 = new A();
		A ob2 = new A();
		System.out.println(ob1.i+" "+ob1.j);
		ob2.i=10;
		ob2.j=20;
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		A ob3 = new A();
		ob3.i=30;
		ob3.j=40;
		System.out.println(ob3.i);
		System.out.println(ob3.j);
		ob1.i=50;
		ob1.j=60;
		System.out.println(ob1.i);
		System.out.println(ob1.j);

	}

}
