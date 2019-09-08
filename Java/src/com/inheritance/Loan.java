//sample program for inheritance
package com.inheritance;

public class Loan {
	String type;
	double roi;
	int tennure;
	double amount;
	double interest(int i)
	{
		double amount=i+(double)(i*roi*tennure)/100;
		System.out.println(amount);
		return amount;
	}
	Loan()
	{
		
	}
	Loan(String type, double roi, int tennure)
	{
		this.type=type;
		this.roi=roi;
		this.tennure=tennure;
	}
}
