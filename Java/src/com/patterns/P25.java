/*
10101
0101
010
10
1
*/
package com.patterns;

public class P25 
{

	public static void main(String[] args)
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i+j<=n-1)
					System.out.print(k++%2);		
				
			}
			System.out.println();

			
		}

	}

}
