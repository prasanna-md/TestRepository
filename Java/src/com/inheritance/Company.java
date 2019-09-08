//sample program for inheritance
package com.inheritance;

public class Company {

	public static void main(String[] args) {
		TY t1=new TY("Prasanna",15000,"Selenium");
		System.out.println("Name:"+t1.name+" id:"+t1.id+" Tool:"+t1.tool);
		t1.work();
		t1.testCase();
		TY t2=new TY("Pooja",14000,"Selenium");
		System.out.println("Name:"+t2.name+" id:"+t2.id+" Tool:"+t2.tool);
		t2.work();
		t2.testCase();


	}

}
