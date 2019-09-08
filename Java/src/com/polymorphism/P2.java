//sample program for polymorphism
package com.polymorphism;

public class P2 extends P1 {
	void bulletPrakash()
	{
		System.out.println("from bulletPrakash in P2");
	}
	static void klRahul()
	{
		System.out.println("from klRahul in P2");
	}
	public static void main(String[] args) {
		P1.klRahul();
		P2.klRahul();
		P1 ob1=new P2();
		ob1.klRahul();
		ob1.bulletPrakash();
		P1 ob2=new P1();
		ob2.klRahul();
		ob2.bulletPrakash();
		P2 ob=new P2();
		ob.klRahul();
		ob.bulletPrakash();
		
	}

}
