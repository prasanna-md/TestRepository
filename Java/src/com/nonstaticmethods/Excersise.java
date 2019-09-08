//sample program for non staticmethods
package com.nonstaticmethods;

public class Excersise {
	static int i;
	int j;
	public void P1()
	{
		//accessing static inside non static context
	System.out.println(i);//directly
	Excersise.i=200;//using class name
	System.out.println(Excersise.i);
	//accessing non static member from non static context
	System.out.println(j);//directly
	System.out.println(this.j);//using this
	}

	public static void main(String[] args) {
		//accessing static member in to static method
System.out.println("From main");
System.out.println(i);//directly
Excersise.i=20;
System.out.println(Excersise.i);//class name
//accessing non static 
Excersise E1 = new Excersise();//create object
E1.j=10;//by creating an object and using an object reference
E1.P1();
System.out.println(E1.j);


	}

}
