//sample program for non static block
package com.nonstaticblock;

public class Employee {
	static int count;
	String id;
	{
		count++;
		id="TY"+count;
	}

	public static void main(String[] args) {
		Employee e1  = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e3.id);
		System.out.println(e4.id);
		System.out.println(e5.id);
		System.out.println(e6.id);
		System.out.println(count);
	
	}

}
