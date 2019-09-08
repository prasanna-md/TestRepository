//sample program for non static block
package com.nonstaticblock;

public class C1 {
	int i;
	int j;
	C1()
	{
		
	}
	C1(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	static C1 generateObject(int i,int j)
	{
		return new C1(i,j);
	}
	C1 initialize(int i,int j)
	{
		this.i=i;
		this.j=j;
		return this;
	}
	void display()
	{
		System.out.println("i value is "+this.i);
		System.out.println("j value is "+this.j);
	}

	public static void main(String[] args) {
		C1 ob = C1.generateObject(30,60);
		ob.display();
		ob.initialize(90,180).display();

	}
}
