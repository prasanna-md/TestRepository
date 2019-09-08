//sample program for polymorphism
package com.polymorphism;

public class B extends A{
	void test()
	{
		System.out.println("from test() of B");
	}

	public static void main(String[] args) {
		A ob;
		ob=new A();
		ob.test();
		System.out.println("--------");
		ob=new B();//auto upcasting
		ob.test();
		A ob1=new B();
		ob1.test();
		
		

	}

}
