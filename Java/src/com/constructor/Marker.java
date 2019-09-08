package com.constructor;

public class Marker {
	String color;
	double length;
	Marker(String color, double length)
	{
		this.color=color;
		this.length=length;
	}
	public static void main(String[] args) {
		Marker m1=new Marker("Black", 3.5);
		System.out.println(m1.color+" "+m1.length);
	}

}
