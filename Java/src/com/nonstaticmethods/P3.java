//sample program for non staticmethods
package com.nonstaticmethods;

public class P3 {
	int i;
	void test()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
	P3 ob1 = new P3();
	ob1.test();
	P3 ob2 = new P3();
	ob2.test();
	ob2.i=20;
	ob2.i=200;
	ob2.test();
	}

}
