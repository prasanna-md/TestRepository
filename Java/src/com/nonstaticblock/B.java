//sample program for non static block
package com.nonstaticblock;

public class B {
	B()	
	{
		this(10);
		System.out.println("from A()");
	}
	B(int i)
	{
		System.out.println("from int B(int)");
	}

	public static void main(String[] args) {
		B ob1 = new B();
		System.out.println("*****");
		B ob2 = new B(10);
	}
}
	



