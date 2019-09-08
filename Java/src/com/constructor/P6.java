//sample program for constructor
package com.constructor;

public class P6 {
	boolean x;
	double y;
	P6(boolean x, double y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		P6 ob1=new P6(false, 2.2);
		P6 ob2=new P6(true, 3.7);
		P6 ob3=new P6(false, 0.2);
		System.out.println(ob1.x+" "+ob1.y);
		System.out.println(ob2.x+" "+ob2.y);
		System.out.println(ob3.x+" "+ob3.y);

	}

}
