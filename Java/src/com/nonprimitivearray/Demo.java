package com.nonprimitivearray;

public class Demo {

	public static void main(String[] args) {
		Songs[] s = {new Songs("teri meri",4.2,"RAFK"), new Songs("ABCD",4.5,"Prasanna")};
		for(Songs s2 : s)
		{
			System.out.println(s2.title);
			System.out.println(s2.singer);
			System.out.println(s2.duration);
		}

	}

}
