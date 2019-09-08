//sample program for non static variable
package com.nonstaticvariable;

public class Company {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		e1.name="Sridhar";
		e1.id=101;
		e2.name="Pavan";
		e2.id=101;
		e3.name="Priya";
		e3.id=101;
		System.out.println(e1.name+ " id is "+e1.id);
		System.out.println(e2.name+ " id is "+e2.id);
		System.out.println(e3.name+ " id is "+e3.id);

	}

}
