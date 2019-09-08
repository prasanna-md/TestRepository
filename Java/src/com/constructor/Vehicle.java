package com.constructor;

public class Vehicle {
Vehicle()
{
	System.out.println("Jaguar");
}
Vehicle(int a)
{
	System.out.println("Bentley Continental GT");
}
	public static void main(String[] args) {
   Vehicle ob = new Vehicle();
   Vehicle ob1= new Vehicle(20);
	}

}
