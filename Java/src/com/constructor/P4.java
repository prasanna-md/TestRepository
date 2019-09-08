//sample program for constructor
package com.constructor;

public class P4 {
	int j;
	static int i;
	P4()
	{
		i=10;//accessing static member directly
		System.out.println(P4.i);//10//accessing static member using class name
		System.out.println(j);//0//accessing static member directly
		j=20;
		System.out.println(this.j);//20//accessing non static member using this
		System.out.println(this);//`P4@100
	}

	public static void main(String[] args) {
		P4 ob = new P4();
	}

}
