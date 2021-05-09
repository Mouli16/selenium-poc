package Javaprogs;

import java.util.Scanner;

public class numRev {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 int x= 45, y=0;   
	     //  Scanner sc = new Scanner(System.in);
	    //  x= sc.nextInt();
	      while(x!=0) 
	      {
	       int digit = x%10;
	       y= y*10+digit;
	       x/=10;
	       }
System.out.println("Reversed number:" + y);
}
}
