/*
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5
*/
package com.patterns;

public class P18 
{

	public static void main(String[] args) 
	{
		{
			int n=5,k=1;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					if(i+j<=n-1)
						System.out.print(k+" ");
				}
				System.out.println();
				k++;
			}
		
		}
	}

}
