//sample program for constructor
package com.constructor;

public class P5 {
	int i;
	P5()
	{
		i=10;
	}

	public static void main(String[] args) {
		P5 p1 = new P5();
		P5 p2 = new P5();
		P5 p3 = new P5();
		System.out.println(p1.i);
		System.out.println(p2.i);
		System.out.println(p3.i);
	}

}
