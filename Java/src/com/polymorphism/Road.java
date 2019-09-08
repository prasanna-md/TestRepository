//sample program for polymorphism
package com.polymorphism;


public class Road {

	public static void main(String[] args) {
		Vehicle[] vehicle=new Vehicle[5];
		vehicle[0]=new Vehicle("Red");
		vehicle[1]=new Car("Black","Jaguar");
		vehicle[2]=new Car("Maroon","R8");
		vehicle[3]=new Jaguar("White", "Q6", "SUV");
		vehicle[4]=new Jaguar("Blue", "A8", "Sedan");
		
		
		for(Vehicle v : vehicle)
		{
			System.out.println("VehicleNo "+v.VehicleNo);
			System.out.println("Color "+v.color);
			if(v instanceof Car)
			System.out.println("name "+((Car)v).name);
			if(v instanceof Jaguar)
			System.out.println("type "+((Jaguar)v).type);
			v.move();
			v.move("NewYork");
			System.out.println("_________________");
			
			
		}

	}

}
