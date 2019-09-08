package com.polymorphism;

public class Jaguar extends Car {
	String type;
	Jaguar()
	{
		
	}
	Jaguar(String color,String name,String type)
	{
		super(color,name);
		this.type=type;
	}
	void move(String location)
	{
		System.out.println(type+" car is moving towards "+location);
	}

}
