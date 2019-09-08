//sample program for non static block
package com.nonstaticblock;

public class A {
	A()
	{
		System.out.println("from A()");
	}
	A(int i)
	{
		this();
		System.out.println("from int(int)");
	}

	public static void main(String[] args) {
		A ob1 = new A();
		System.out.println("*****");
		A ob2 = new A(10);

	}

}
