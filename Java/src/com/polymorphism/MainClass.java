package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		A[] array={new A(),new B(),new A(),new B()};
		for(int i=0;i<array.length;i++)
		{
			array[i].test();
			System.out.println("______________");
		}
        for(A ob:array)
        {
        	ob.test();
        	System.out.println("*************");
        }
	}

}
