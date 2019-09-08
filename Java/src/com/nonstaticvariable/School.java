//sample program for non static variable
package com.nonstaticvariable;

public class School {

	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		s1.name="ABCD";
		s1.marks=88;
		s2.name="EFGH";
		s2.marks=89;
		s3.name="IJKL";
		s3.marks=88;
		System.out.println(s1.name+ " marks is "+s1.marks);
		System.out.println(s2.name+ " marks is "+s2.marks);
		System.out.println(s3.name+ " marks is "+s3.marks);

	}

}
