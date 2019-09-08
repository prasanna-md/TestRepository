//sample program for inheritance
package com.typesofinheritance;

public class MainClass {
	 public static void display(Vehicle x)
	    {
	    	System.out.println("Color is "+x.color);
	    	if(x instanceof TwoWheeler)
	    	System.out.println("Name is "+((TwoWheeler)x).name);
	    	if(x instanceof Bike)
	    	System.out.println("Mileage is "+((Bike)x).mileage);
	    	System.out.println("***********");
	    }

	public static void main(String[] args) {
		
		Bike b1=new Bike("Black","Harley Davidson",35);
		TwoWheeler t1=new TwoWheeler("Red","Pulsar");
		Vehicle v1=new Vehicle("Metallic");
		Bike b2=new Bike("Black","Harley Davidson",35);
		
		display(b1);
		display(t1);
		display(v1);
		display(b2);
	}

}
