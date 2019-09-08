package com.pack2;
import com.pack1.R1;

public class R4 {

	public static void main(String[] args) {
		System.out.println(R1.i);//protected members are not visible outside the package in diff class
        R1 ob=new R1();
        System.out.println(ob.j);//protected members are not visible outside the package in diff class
	}

}
