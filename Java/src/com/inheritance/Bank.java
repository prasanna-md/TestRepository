//sample program for inheritance
package com.inheritance;

public class Bank {

	public static void main(String[] args) {
		Home h1=new Home("HOME", 12.5, 3, "Shivamogga");
		System.out.println("Type : "+h1.type+" roi: "+h1.roi+" tennure: "+h1.tennure+" Place: "+h1.place);
        h1.interest(500000);
        Loan l1=new Loan("Education", 11.5, 4);
		System.out.println("Type : "+l1.type+" roi: "+l1.roi+" tennure: "+h1.tennure);
        l1.interest(300000);
	}

}
