//sample program for non staticmethods
package com.nonstaticmethods;

public class P1 {
	void test ()
	{
		System.out.println("from test");
	}
	

	public static void main(String[] args) {
		
          System.out.println("from main");
          P1 ob1=new P1();
          ob1.test();
          System.out.println("main ends");
	}

}
