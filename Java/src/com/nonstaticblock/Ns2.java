//sample program for non static block
package com.nonstaticblock;

public class Ns2 {
	{
		System.out.println("From IIB-1");
	}

	public static void main(String[] args) {
		System.out.println("From main");
		Ns2 ob = new Ns2();
		Ns2 ob1 = new Ns2();
			System.out.println("Main ends");
		}
	{
		System.out.println("From IIB-2");

	}

}
