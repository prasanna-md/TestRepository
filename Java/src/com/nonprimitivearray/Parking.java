package com.nonprimitivearray;

public class Parking {
	static void ParkingLot(Bikes[]Parking)
	{
		for(int i=0;i<Parking.length;i++)
		{
			System.out.println(Parking[i].brand);
		    System.out.println(Parking[i].mileage);
		    System.out.println(Parking[i].color);
		    System.out.println("__________");
		}
	}

	public static void main(String[] args) {
		Bikes[]Parking = new Bikes[5];
		Parking [0] = new Bikes ("Fz", 35, "Black");
		Parking [1] = new Bikes ("Rf", 35, "Grey");
		Parking [2] = new Bikes ("Activa", 35, "White");
		Parking [3] = new Bikes ("KTM", 35, "Black");
		Parking [4] = new Bikes ("Pulsar", 35, "Blue");
		ParkingLot(Parking);
		
		

	}

}
