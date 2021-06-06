package coreJava;

public class StaticExample 
{
    String name; //instance variables
    String address;
    static String city;
    static int i; //if i is not declared static, then it will reset to 0 every time
    
    static   //static block
    {
    	city= "Kolkata";
    	i=0;
    }
    
    StaticExample(String name, String address)
    {
    	this.name= name;
    	this.address= address;
    	i++;
    	System.out.println(i);
    }
    
    public void getDetails()
    {
    	System.out.println(name +" " + address +" "+ city);
    }
    
    public static void getCity()
    {
    	System.out.println(city);
    }
    
	public static void main(String[] args) 
	{
		StaticExample obj = new StaticExample("Parijat","Behala");
		StaticExample obj1 = new StaticExample("Mouli","Birati");
		obj.getDetails();
		obj1.getDetails();
        StaticExample.getCity(); //static methods can be accessed without object using class name
        StaticExample.i=9; //static
        obj.address="DumDum" ; //non static
	}

}
