//sample program for non static block
package com.nonstaticblock;

public class C {
	C()	
	{
		this(10);
		System.out.println("from A()");
	}
	C(int i)
	{
		this(10.0);
		System.out.println("from int B(int)");
	}
	C(double i)
	{
		System.out.println("from int c(int)");
	}

	public static void main(String[] args) {
		C ob1 = new C();
		System.out.println("*****");
		C ob2 = new C(10);

	}

}
