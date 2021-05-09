package Javaprogs;
import java.util.*; 

public class swapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	
		       int x, y, t;// x and y are to swap   
		       Scanner sc = new Scanner(System.in);  
		       System.out.println("Enter the value of X and Y");  
		       x = sc.nextInt();  
		       y = sc.nextInt();  
		       System.out.println("before swapping numbers: "+x +"  "+ y);  
		       /*swapping */  
		       t = x;  
		       x = y;  
		       y = t;  
		       System.out.println("After swapping: "+x +"   " + y);  
		       System.out.println( );  
		    }    
		}  
	


