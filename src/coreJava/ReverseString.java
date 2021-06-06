package coreJava;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String s= "madam";
		String t = "";
		for(int i =s.length()-1; i>=0;i--)
		{
			t= t+s.charAt(i);
			
		}
      System.out.println(t);
	 
      if(s.equals(t))
      
      { 
    	  System.out.println("It is a palindrome");
      }  
      else
      {
	      System.out.println("It is not a palindrome");
      }
     }

 }
