//sample program for non static variable
package com.nonstaticvariable;

public class Rider {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle();
		v1.name="Jaguar XJ";
		v1.color="Satorini balck";
		v2.name="Lexus LS";
		v2.color="Manganese luster";
		v3.name="Bentley Continental GT";
		v3.color="Light onyx";
		v4.name="Lamborgini";
		v4.color="Metallic maroon";
		v1.speed=250;
		v2.speed=250;
		v3.speed=329;
		v4.speed=275;
		System.out.println(v1.name+" color is "+v1.color+" and its top speed is "+v1.speed);
		System.out.println(v2.name+" color is "+v2.color+" and its top speed is "+v2.speed);
		System.out.println(v3.name+" color is "+v3.color+" and its top speed is "+v3.speed);
		System.out.println(v4.name+" color is "+v4.color+" and its top speed is "+v4.speed);
		
		

	}

}
