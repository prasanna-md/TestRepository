package com.pack2;
import com.pack1.Q1;

public class Q4 {

	public static void main(String[] args) {
		System.out.println(Q1.i);//i is a having default access specifiers so not visible outside pack 1
		Q1 ob=new Q1();//default constructor
		System.out.println(ob.j);//j is a having default access specifiers hence not visible outside pack 1

	}

}
