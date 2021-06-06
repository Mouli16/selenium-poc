package coreJava;

public class ConstructDemo extends MaxMinNumber
{  
	int a=3,b=2; //global variable
	// Default 
	
	public ConstructDemo()

	{  
		
		super(); //super keyword for constructors; it should always be the first line in child constructor
		System.out.println(" I am in the child constructor"); 
	    System.out.println(" I am in the constructor lecture 1"); // 
	  
	} 
	// Parameterized constructor 
	public ConstructDemo(int a, int b) 
	{ 
		System.out.println(" I am in the parameterized constructor"); 
	    int c=a+b; System.out.println(c);
	} 
	
	public ConstructDemo(String str) 
	{ 
		System.out.println(str); 
	} 
	public void getData()
	{ 
		super.getData();  //super keyword for methods
		System.out.println("Get data of child class");
	}  //will not return values //name of constructor should be the class name
	

 public void add()
 {

		int a= 4; //local variable 
	    //printing sum of local + global 'a'
	    int b= a+this.a;
	    int d= a+this.b;  //or a+b
	    System.out.println("Sum=" + b + "and" + d);
	    
 }

    public static void main(String[] args) 
    { 
    	ConstructDemo cd= new ConstructDemo(); 
    //	ConstructDemo cds= new ConstructDemo("hello");
    //	ConstructDemo c= new ConstructDemo(4,5); 
    	cd.getData();
    	cd.add();
    	
    	// compiler will call implicit constructor if you have not defined constructor block 
    	//when ever you create an object constructor is called 
    	//block of code when ever an object is created 
    }

 }