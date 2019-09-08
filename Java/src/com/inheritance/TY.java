//sample program for inheritance
package com.inheritance;

public class TY extends Employee {
	String tool;
    void testCase()
    {
    	System.out.println("Writing testcases using tool");
    }
    TY(String name,double salary,String tool)
    {
    	super(name,salary);
    	this.tool=tool;
    }
}
