
//sample program for constructor
package com.constructor;

public class P3 {
	P3()
	{
		System.out.println("P4 () constructor");
	}
P3(int i)
{
	System.out.println("P4 (int) constructor");
}
	public static void main(String[] args) {
		P3 ob = new P3();
		System.out.println("+++++++");
		P3 ob2 = new P3(10);

	}

}
