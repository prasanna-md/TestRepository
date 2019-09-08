//sample program for non static block
package com.nonstaticblock;

public class B1 {
	int i;
	public B1 initialize(int i)
	{
		this.i=i;
		return this;
	}
	public static B1 createObject()
	{
		return new B1();
	}
    void display()
    {
    	System.out.println("i value is "+this.i);
    }
	public static void main(String[] args) {
		B1.createObject().initialize(10).display();

	}

}
