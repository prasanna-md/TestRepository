/*
    1
   00
  111
 0000
11111
*/
package com.patterns;

public class P30 
{
		public static void main(String[] args) 
		{
			int n=5,k=1;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					if(i+j>=n-1)
					{
						if(k%2==0)
							System.out.print("0");
						else
							System.out.print("1");
					}
					else
						System.out.print(" ");
				}
							
				k++;
				System.out.println();
			}
				
		}
	}

