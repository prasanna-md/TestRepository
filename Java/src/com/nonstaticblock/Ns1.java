//sample program for non static block
package com.nonstaticblock;

public class Ns1 {
	{
		System.out.println("IIB-1");

	}
	public static void main(String[] args){
		Ns1 ob = new Ns1();
		System.out.println(new Ns1());
	}

}
