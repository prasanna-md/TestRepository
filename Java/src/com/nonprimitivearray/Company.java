package com.nonprimitivearray;

public class Company {

	public static void main(String[] args) {
		Employee[] emplyoee = new Employee[5];
		emplyoee[0]=new Employee(1,"Sherkhan", 1.2);
		emplyoee[1]=new Employee(2,"Baghira", 2.2);
		emplyoee[2]=new Employee(3,"Mowgly", 3.2);
		emplyoee[3]=new Employee(4,"Bhalu", 4.2);
		emplyoee[4]=new Employee(5,"Moti", 5.2);
		for(int i=0;i<emplyoee.length;i++)
		System.out.println(" employee id:"+ emplyoee[i].id+"\n name:"+emplyoee[i].name+ "\n salary:"+emplyoee[i].salary);
	

	}

}
