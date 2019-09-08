//sample program for non static block
package com.nonstaticblock;

public class Vanheusen {
	String color;
	int size;
	String productCode;
	static int countShirt;
	Vanheusen()
	{
		countShirt++;
		productCode="VAN"+countShirt;
	}
	Vanheusen(String color, int size)
	{
		this();
		this.color=color;
		this.size=size;
	}

	public static void main(String[] args) {
		Vanheusen v1 = new Vanheusen("Black", 40);
		System.out.println(v1.color+" "+v1.size);
		Vanheusen v2 = new Vanheusen("Brown", 42);
		System.out.println(v2.color+" "+v2.size);
	}

}
