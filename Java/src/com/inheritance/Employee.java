//sample program for inheritance
package com.inheritance;

public class Employee {
	String id;
	String name;
	double salary;
	static int count;
	{
		count++;
		id="TY"+count;
	}
	void work()
	{
		System.out.println("Employee is working");
	}
    Employee()
    {
    	
    }
    Employee(String name,double salary)
    {
    	this.name=name;
    	this.salary=salary;
    }
}
