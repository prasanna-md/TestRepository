package com.pack1;

public class P3 extends P1 {

	public static void main(String[] args) {
		System.out.println(P3.j);
		System.out.println(P3.i);//private member i is private member of p1 hence not herited
        
		P3 ob=new P3();
		System.out.println(ob.x);//cte bcoz x is private non static memeber
		// P1 so its not inherited in sub class objects
	}

}
