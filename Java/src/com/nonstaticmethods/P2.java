//sample program for non staticmethods
package com.nonstaticmethods;

public class P2 {
int i;
void test()
{ 
	System.out.println(i);
}

	public static void main(String[] args) {
		P2 ob1=new P2();
		ob1.i=200;
		ob1.test();

	}

}
