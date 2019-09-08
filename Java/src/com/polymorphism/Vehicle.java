//sample program for polymorphism
package com.polymorphism;

public class Vehicle {
	String VehicleNo;
	String color;
	static int VehicleCount;
	Vehicle()
	{
		VehicleCount++;
		VehicleNo="KA"+VehicleCount;
	}
	Vehicle(String color)
	{
		this();
		this.color=color;
	}
	void move()
	{
		System.out.println("Vehicle is moving");
	}
	void move(String location)
	{
		System.out.println("Vehicle is moving towards"+location);
	}
	

}
