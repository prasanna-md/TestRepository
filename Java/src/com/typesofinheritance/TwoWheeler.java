//sample program for inheritance
package com.typesofinheritance;

public class TwoWheeler extends Vehicle {
	String name;
	TwoWheeler()
	{
		
	}
    TwoWheeler(String color,String name)
    {
    	super(color);
    	this.name=name;
    }
}
