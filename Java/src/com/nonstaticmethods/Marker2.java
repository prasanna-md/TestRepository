//sample program for non staticmethods
package com.nonstaticmethods;

public class Marker2 {
 
		String name;
		String color;
		double length;
		int price;
		
		void initializer(String name, String color, double length, int price)
		{
			this.name=name;
		    this.color=color;
		    this.length=length;
		    this.price=price;
		    System.out.println(this.name);
		    System.out.println(this.color);
		    System.out.println(this.length);
		    System.out.println(this.price);
		}
			public static void main(String[] args) {
			
	           Marker m1=new Marker();
	           m1.initializer("Rorito", "Black", 3.5, 125);
	           System.out.println(m1.name+" is a "+m1.color+" marker having length of "+m1.length+" and cost is 100 "+m1.price);
		}

	}

