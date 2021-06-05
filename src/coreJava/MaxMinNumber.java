package coreJava;

public class MaxMinNumber 
{
	public void Max()
	{
		int ab[][]= {{2,6,4},{3,4,1},{5,9,8}};
		int max= ab[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3; j++)
			{
				if(ab[i][j]>max)
				{
					max= ab[i][j];
				}
				
					
			}
		}
	     System.out.println("Max number: " +max);	
	}
	
	public void Min()
	{
		int ab[][]= {{2,6,4},{3,4,1},{5,9,8}};
		int min= ab[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3; j++)
			{
				if(ab[i][j]<min)
				{
					min= ab[i][j];
				}
				
					
			}
		}
	     System.out.println("Min number: " +min);	
	}
	
	public void printArray()
	{
		int ab[][]= {{2,6,4},{3,4,1},{5,9,8}};
		
		System.out.println("**Printing Array**");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(ab[i][j]);
				System.out.print("\t");
				
			}
		 System.out.println(" ");
		}
	     
	}
	
	

	public static void main(String[] args) 
	{
		
		MaxMinNumber b = new MaxMinNumber();
		
		b.printArray();
		b.Max();
		b.Min();

    }
}
