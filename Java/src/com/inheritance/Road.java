//sample program for inheritance
package com.inheritance;

public class Road {

	public static void main(String[] args) {
		Car c1=new Car("Black", 2345, "Bentley");
		System.out.println("color is "+c1.color+" and vehicle no is "+c1.vno+" and Brand is "+c1.brand);
        Car c2=new Car("Blue", 1234, "Jaguar");
        System.out.println("color is "+c2.color+" and vehicle no is "+c2.vno+" and Brand is "+c2.brand);
        c1.move();
        Vehicle v1=new Vehicle("Brown", 7854);
        System.out.println(v1.color+" "+v1.vno);
        v1.move();
	}

}
