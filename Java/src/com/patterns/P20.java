/*
00000
1111
000
11
0
*/

package com.patterns;

public class P20 {

	public static void main(String[] args)
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i+j<=n-1)
				{
					if(k%2==0)
						System.out.print("1");
					else
						System.out.print("0");
				}
			}
						
			k++;
			System.out.println();
		}
	}

}
