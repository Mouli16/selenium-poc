package coreJava;

public class MaxMinNumber

{
	public MaxMinNumber()
	{
		System.out.println("Super class constructor");
	}
	public void getData()
	{
		System.out.println("Get data of parent class");
	}
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
	public void findNumber() //finding the maximum number in the column containing the minimum value of the array
	{
		int ab[][]= {{2,6,4},{3,4,1},{5,9,8}};
		
	int min=ab[0][0];
	int mincoloumn = 0;


	for(int i=0;i<3;i++)
	    {
	       for(int j=0;j<3;j++)
	        {
	          if(ab[i][j]<min)//2
	              {
	                 min=ab[i][j];
	                 mincoloumn=j;
	              }
	         }
	     }
	//=1
	     int max=ab[0][mincoloumn];
	     int k = 0;
	     while(k<3)
	     {
	       if(ab[k][mincoloumn]>max)
	         {
	            max=ab[k][mincoloumn];
	         }
	             k++;
	      }

	          System.out.println("Max number in min value column: " +max);
	      }


	

	public static void main(String[] args) 
	{
		
		MaxMinNumber b = new MaxMinNumber();
		
		b.printArray();
		b.Max();
		b.Min();
		b.findNumber();

    }
}
