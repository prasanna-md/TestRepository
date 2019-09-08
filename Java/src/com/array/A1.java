package com.array;

public class A1 {

	public static void main(String[] args) {
		int[]a = new int[10];
		
			for(int i=0,j=10;j<a.length;j++)
			{
				
				if (j%2==0)
				{
					a[i]=j;
					i++;
				}
			}

	}

}
