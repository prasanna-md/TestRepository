//sample program for method overriding using scenario
package com.methodoverriding;

public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.works();
		TestEngineer t1=new TestEngineer();
		t1.works();
        Developer d1=new Developer();
        d1.works();
	}

}
