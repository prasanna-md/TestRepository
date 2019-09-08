//sample program for inheritance
package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(B1.i);
		//System.out.println(A1.j);compile time error
		System.out.println(B1.j);
		A1.i=100;
		System.out.println(B1.i);
		B1.j=200;
		//System.out.println(A1.j);compile time error
		System.out.println(B1.j);

	}
}
