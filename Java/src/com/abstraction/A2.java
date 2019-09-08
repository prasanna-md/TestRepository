//sample program for abstraction
package com.abstraction;

class A2 extends A1 {
	void test()
	{
		System.out.println("test () method implemented in A2");
	}
	public static void main(String[] args) {
		A1 ob=new A1();//class A1 abstract can't be instantiated
		A2 ob1=new A2();
	}

}
