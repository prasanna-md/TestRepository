package com.nonstaticblock;
//write a program to create class van husen shirts having properties 
//string color , int size, string product code
//the product code for the fist shirt is vn001
//create two constructor for class 
//one will be parameterized and the other is non parameterized

public class Ns4 {
	String color;
	int size;
	String productcode;
	static int countShirt;
	{
	    countShirt++;
	    productcode="VAN"+countShirt;
	}
	Ns4()
	{
		color="Black";
		size=40;
	}
	Ns4(String color, int size)
	{
		this();
		this.color=color;
		this.size=size;
	}

	public static void main(String[] args) {
		Ns4 n1 = new Ns4();
		System.out.println(n1.color+" "+n1.size+" "+n1.productcode);
		Ns4 n2 = new Ns4("Brown", 42);
		System.out.println(n2.color+" "+n2.size+" "+n2.productcode);
	}

}
